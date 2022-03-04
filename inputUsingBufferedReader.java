package practice.ways.to.input;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/**
 * @author Ishita.Singhal
 *
 */
public class inputUsingBufferedReader {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(reader);
		System.out.println("Input using Buffered Reader");
		System.out.println("Enter name of language");
		String name=br.readLine();
		System.out.println("in "+name);

	}

}
