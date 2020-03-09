package day20;
import java.io.*;

public class TestReaderWriter {
	public static void main(String[] args) throws Exception{
		try( 
				OutputStream fos = new FileOutputStream("a.txt");
				Writer fw = new OutputStreamWriter(fos , "GBK");
				PrintWriter out = new PrintWriter(fw)
		){
			out.println("����������ǧ��");
			out.println("�������ݾ�˴Ң");
			out.println("�������ķ�����");
			out.println("��ɽ���⻯Ϊ��");
			out.println("��������������");
			out.println("�ض���������ҡ");
			out.println("��������������");
			out.println("ֽ������������");
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
