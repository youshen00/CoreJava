package day20;
import java.io.*;

public class TestReaderWriter {
	public static void main(String[] args) throws Exception{
		try( 
				OutputStream fos = new FileOutputStream("a.txt");
				Writer fw = new OutputStreamWriter(fos , "GBK");
				PrintWriter out = new PrintWriter(fw)
		){
			out.println("春风杨柳万千条");
			out.println("六亿神州尽舜尧");
			out.println("红雨随心翻作浪");
			out.println("青山着意化为桥");
			out.println("天连五岭银锄落");
			out.println("地动三河铁臂摇");
			out.println("借问瘟君欲何往");
			out.println("纸船明烛照天烧");
		}
		catch(Exception e) {}
		
		try(
				InputStream fis = new FileInputStream("a.txt");
				Reader fr = new InputStreamReader(fis , "Big5");
				BufferedReader in = new BufferedReader(fr)
		){
			while(true) {
				String s = in.readLine();
				if (s == null) break;
				System.out.println(s);
			}
		}
		catch(Exception e) {}
	}
}
