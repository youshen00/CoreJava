package day19;

import java.io.*;

public class TestBufferedStream {

	public static void main(String[] args) {
		/*
		FileOutputStream fos = new FileOutputStream("a.txt");
		BufferedOutputStream out = new BufferedOutputStream(fos);
		out.write('A');
		out.close();
		*/
		
		try(
				FileOutputStream fos = new FileOutputStream("a.txt");
				BufferedOutputStream out = new BufferedOutputStream(fos)
		){
			out.write('A');
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
