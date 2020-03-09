package day20;

import java.io.UnsupportedEncodingException;

public class TestString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "中关村软件园人才基地百知教育Java2001班";
		byte[] bs = str.getBytes("GBK"); //编码
		String str2 = new String(bs , "Big5"); // 解码
		
		byte[] bs2 = str2.getBytes("Big5");
		String str3 = new String(bs2 , "GBK");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
	}

}
