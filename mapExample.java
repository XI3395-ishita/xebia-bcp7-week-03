package practice.collections;
import java.util.*;
/**
 * @author Ishita.Singhal
 *
 */
public class mapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String> str=new HashMap<Integer,String>();
		
		str.put(1,"Apple");
		str.put(2,"Banana");
		str.put(3,"Grapes");
		
		
		System.out.println("Fruits of the week are: ");
		
		for(Map.Entry str1: str.entrySet()) {
			System.out.println(str1.getKey()+"-"+str1.getValue());
		}
	}

}
