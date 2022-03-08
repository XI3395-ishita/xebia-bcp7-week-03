package practice.collections;

import java.util.*;

/**
 * @author Ishita.Singhal
 *
 */
public class setExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> str=new HashSet<>();
		
		str.add("Apple");
		str.add("Banana");
		str.add("Grapes");
		
		
		System.out.println("Fruits of the week are: ");
		
		for(String str1: str) {
			System.out.println(str1);
		}
	}

}
