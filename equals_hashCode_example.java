package practice.oops.concepts;

/**
 * @author Ishita.Singhal
 *
 */
public class equals_hashCode_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="Welcome";
		String b="Welcome";
		
		if(a.equals(b)) {
			System.out.println("variables a and b have the same value and their respective hashcodes are:");
			System.out.println("Hashcode of a: "+a.hashCode());
			System.out.println("Hashcode of b: "+b.hashCode());
		}
		
		
		String c="Java";
		String d="Python";
		
		if(!c.equals(d)) {
			System.out.println("variables c and d do not have the same value and their respective hashcodes are:");
			System.out.println("Hashcode of c: "+c.hashCode());
			System.out.println("Hashcode of d: "+d.hashCode());
		}
		
	}

}
