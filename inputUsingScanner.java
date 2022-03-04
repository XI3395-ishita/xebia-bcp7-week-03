/**
 * 
 */
package practice.ways.to.input;
import java.util.*;
/**
 * @author Ishita.Singhal
 *
 */
public class inputUsingScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of integer a");
		int a=sc.nextInt();
		System.out.println("Enter value of double b");
		double b=sc.nextDouble();
		
		sc.close();
		
		
		System.out.println("a*10= "+a*10);
		System.out.println("b+10= "+(b+10));
		

	}

}
