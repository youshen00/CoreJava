package day21;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class Exc15_4 {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("a.txt");
		InputStreamReader ir = new InputStreamReader(fis , "UTF-8");
		BufferedReader in = new BufferedReader(ir);
		
		List<String> list = new ArrayList<>();
		while(true) {
			String str = in.readLine();
			if (str == null) break;
			list.add(str);
		}
		
		in.close();
				
		FileOutputStream fos = new FileOutputStream("b.txt");
		OutputStreamWriter ow = new OutputStreamWriter(fos , "UTF-8");
		PrintWriter out = new PrintWriter(ow);
		
		//PrintWriter out = new PrintWriter("b.txt");
		
		for(int i = list.size()-1 ; i >= 0 ; i --) {
			String s = list.get(i);
			out.println(s);
		}
		
		out.close();
	}

}









