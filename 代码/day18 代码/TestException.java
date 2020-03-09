package day18;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		System.out.println("main 1");
		ma(1);
		System.out.println("main 2");
	}
	static void ma(int i)  {
		try {
			System.out.println("ma 1");
			mb(i);
			System.out.println("ma 2");
			return;
		}
//		catch(IOException e) {
//			System.out.println("����IO�쳣: "+e.getMessage());
//		}
//		catch(MyException e) {
//			System.out.println("����MyException: "+e.getMessage());
//		}
		catch(Exception e) {
			e.printStackTrace();// ��ӡ�쳣�����ջ׷����Ϣ
		}
		finally {
			System.out.println("run finally");
		}
		System.out.println("ma 3");
	}
	static void mb(int i) throws IOException , MyException{
		System.out.println("mb 1");
		mc(i);
		System.out.println("mb 2");
	}
	static void mc(int i) throws EOFException,FileNotFoundException ,MyException{
		try{
			System.out.println("mc 1");
			if (i == 0) throw new NullPointerException("��ָ���쳣");
			if (i == 1) throw new EOFException("�ļ�������ֹ");
			if (i == 2) throw new FileNotFoundException("�ļ�û�ҵ�");
			if (i == 3) throw new MyException("���Լ�������쳣, �Ǻ�");
			System.out.println("mc 2");
		}
		finally {
			System.out.println("mc 3");
		}
	}
}

class MyException extends Exception{
	public MyException() {}
	public MyException(String msg) {
		super(msg);
	}
}


class A{
	public void method() throws IOException{}
}
class B extends A{
	public void method() throws EOFException,FileNotFoundException{}
}
















