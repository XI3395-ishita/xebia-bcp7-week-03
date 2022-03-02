
package practice.operators;

public class typesOfOperators {

	public static void main(String[] args) {
		
		//arithmetic operators
		int a=2,b=5;
		int sum=a+b;
		int pro=a*b;
		double div=a/b;
		int diff=b-a;
		double mod=b%a;
		
		System.out.println("The sum is: "+sum);
		System.out.println("The product is: "+pro);
		System.out.println("The division is: "+div);
		System.out.println("The difference is: "+diff);
		System.out.println("The modulous is: "+mod);
		
		//unary operators
		int c=20,d=10;
		c+=10;
		d++;
		d-=8;
		System.out.println("The value of c is: "+c);
		System.out.println("The value of d is: "+d);
		
		//logical operators
		boolean isApple=false;
		boolean isMango=false;
		
		if(isApple && isMango)
			System.out.println("Is neither an apple nor a mango ");
		else if(!isApple && isMango)
			System.out.println("Is an apple");
		else if(isApple && !isMango)
			System.out.println("Is a mango");
		else
			System.out.println("Is either an apple or a mango");
		
		if(isApple || isMango)
			System.out.println("False");
		else
			System.out.println("True");
		
		//relational operators
		int sal1=5000, sal2=10000, sal3=15000;
		
		if(sal1<=sal2)
			System.out.println("Less salary");
		else if(sal2<=sal3)
			System.out.println("Average salary");
		else
			System.out.println("Excellent salary");
		
		//ternary operator
		int x=9;
		int y=(x>10)?x:10;
		System.out.println(y);
		
			
	}

}
