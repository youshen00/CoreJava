package day19;
import java.io.*;
public class TestOutputStream {

	public static void main(String[] args)  {
		/*
		OutputStream os = null;
		try {
			os = new FileOutputStream("a.txt") ;
			os.write('D');
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (os!= null) os.close(); //¹Ø±ÕÁ÷
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		try (OutputStream os = new FileOutputStream("a.txt")){
			os.write('D');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
 