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
//			System.out.println("捕获IO异常: "+e.getMessage());
//		}
//		catch(MyException e) {
//			System.out.println("捕获MyException: "+e.getMessage());
//		}
		catch(Exception e) {
			e.printStackTrace();// 打印异常对象的栈追踪信息
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
			if (i == 0) throw new NullPointerException("空指针异常");
			if (i == 1) throw new EOFException("文件意外中止");
			if (i == 2) throw new FileNotFoundException("文件没找到");
			if (i == 3) throw new MyException("我自己定义的异常, 呵呵");
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
















