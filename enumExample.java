package practice.enumerations;

/**
 * @author Ishita.Singhal
 *
 */

public class enumExample {
public enum City{Agra,Chennai,Delhi,Mumbai}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(City c:City.values()) {
			System.out.println(c);
		}
		
		System.out.println("Index of Chennai is: "+City.valueOf("Chennai").ordinal());
		System.out.println("Index of Agra is: "+City.valueOf("Agra").ordinal());

	}

}
