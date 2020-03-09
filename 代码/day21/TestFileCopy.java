package day21;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestFileCopy {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedOutputStream out = null;
		BufferedInputStream in = null;
		
		Scanner s = new Scanner(System.in);
		String filename = s.next();
		
		File f = new File(filename);
		if (!f.exists() || f.isDirectory()) {
			System.out.println("文件不存在");
			return;
		}
		
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