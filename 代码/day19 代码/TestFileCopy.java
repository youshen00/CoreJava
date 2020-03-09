package day19;
import java.io.*;
public class TestFileCopy {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedOutputStream out = null;
		BufferedInputStream in = null;
		String filename = "a.m2ts";
		try {
			fis = new FileInputStream(filename);
			in = new BufferedInputStream(fis);
			fos = new FileOutputStream("new_"+filename);
			out = new BufferedOutputStream(fos);
			while(true) {
				int a = in.read();
				if (a == -1) break;
				out.write(a);
			}
		}
		catch(IOException e) {e.printStackTrace();}
		finally {
			try {
				if (in!=null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (out!=null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
