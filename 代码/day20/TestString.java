package day20;

import java.io.UnsupportedEncodingException;

public class TestString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "�йش����԰�˲Ż��ذ�֪����Java2001��";
		byte[] bs = str.getBytes("GBK"); //����
		String str2 = new String(bs , "Big5"); // ����
		
		byte[] bs2 = str2.getBytes("Big5");
		String str3 = new String(bs2 , "GBK");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
	}

}
