package day20;
import java.io.*;
public class TestFile {

	public static void main(String[] args) throws Exception{
		//File f = new File("1.txt");
		//f.createNewFile();
		//f.delete();
		//f.mkdir();
		//System.out.println(f.getAbsolutePath());
		
		File f = new File("D:\\java2001");
		File[] fs = f.listFiles();
		for(File ff : fs) {
			if (ff.isFile()) System.out.println("文件: "+ff.getName());
			if (ff.isDirectory()) System.out.println("子目录:"+ff.getName());
		}
	}

}
