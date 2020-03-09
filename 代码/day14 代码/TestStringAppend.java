package day14;

public class TestStringAppend {

	public static void main(String[] args) {
		/*
		String str = "A";
		str = str + "B";
		str = str + "C";
		str = str + "D";
		str = str + "E";
		*/
		
		//String str = "A";
		//StringBuilder sb = new StringBuilder(str);
		/*
		sb.append("B");
		sb.append("C");
		sb.append("D");
		sb.append("E");
		*/
		//sb.append("B").append("C").append("D").append("E");
		//str = sb.toString();
		
		System.out.println(stringBuilderAppend());
		System.out.println(stringAppend());
	}

	static long stringAppend() {
		
		long t1 = System.nanoTime();
		
		String s = "";
		for(int i = 1 ; i <= 1000000; i++) {
			s += "A";
		}
		
		long t2 = System.nanoTime();
		return t2 - t1;
	}
	static long stringBuilderAppend() {
		long t1 = System.nanoTime();
		
		String s = "";
		StringBuilder sb = new StringBuilder(s);
		for(int i = 1 ; i <= 1000000; i++) {
			sb.append("A");
		}
		s = sb.toString();
		
		long t2 = System.nanoTime();
		
		return t2 - t1;
	}
}





