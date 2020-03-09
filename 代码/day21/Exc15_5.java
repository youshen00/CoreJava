package day21;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class Exc15_5 {

	public static void main(String[] args) throws Exception{
		Map<Integer,String> map = new HashMap<>();
		
		FileInputStream fis = new FileInputStream("wc.txt");
		InputStreamReader ir = new InputStreamReader(fis , "UTF-8");
		BufferedReader in = new BufferedReader(ir);
		
		while(true) {
			String str = in.readLine();
			if (str == null) break;
			
			String[] ss = str.split("/");
			map.put(Integer.valueOf(ss[0]), ss[1]);
		}
		
		in.close();
		
		System.out.println(map.get(2018));
	}

}
