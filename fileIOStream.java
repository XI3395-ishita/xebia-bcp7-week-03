package practice.ways.to.input;
import java.io.*;
/**
 * @author Ishita.Singhal
 *
 */
public class fileInput {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream in=null;
		FileOutputStream out=null;
		
		try {
			in=new FileInputStream("C:\\Users\\ishita.singhal\\OneDrive - Xebia Nederland B.V\\Documents");
			out=new FileOutputStream("output.txt");
			
			int c;
			while((c=in.read()) !=-1) {
				out.write(c);
			}
		}
		finally {
			if(in!=null)
				in.close();
			if(out!=null)
				out.close();
		}
		
		
	}

}
