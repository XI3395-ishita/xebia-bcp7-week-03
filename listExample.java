package practice.collections;

import java.util.*;

/**
 * @author Ishita.Singhal
 *
 */
public class listExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> str=new ArrayList<>();
		
		str.add("Apple");
		str.add("Banana");
		str.add("Grapes");
		str.add(1,"Cherry");
		str.add(2,"Kiwi");
		
		System.out.println("Fruits of the week are: ");
		
		for(String str1: str) {
			System.out.println(str1);
		}
		
		System.out.println("Element at 2nd index is: "+str.get(1));

	}

}
