package day19;
import java.io.*;
public class TestInputStream {
	public static void main(String[] args)  {
		try(InputStream is = new FileInputStream("a.txt")){
			while(true) {
				int a = is.read();
				if (a == -1) break;
				System.out.print((char)a);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

