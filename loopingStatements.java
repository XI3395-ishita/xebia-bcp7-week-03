package practice.looping.statements;

public class loopingStatements {

	public static void main(String[] args) {
		
		//for loop
		int i;
		for(i=0;i<=10;i++)
			System.out.println(i);
		
		System.out.println();
		//while loop
		int x=10;
		while(x<15) {
			System.out.println(x);
			x++;
		}
		
		//switch case
		char ch='a';
		switch(ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;	
		default:
			System.out.println("Not a vowel");
			break;
		}
		

	}

}
