package day15;
import java.util.*;
public class TestList {

	public static void main(String[] args) {
		List list =new ArrayList();
		
		list.add("Liucy");
		list.add("Lixx");
		list.add("Zhangmj");
		list.add("Huxz");
		list.add(1 , "Wangt");
		
		//System.out.println(list.indexOf("Lixx"));
		//list.remove(2);
		//System.out.println(list.indexOf("Lixx"));
		
		System.out.println("�±����");
		for(int i = 0 ;  i < list.size() ; i++) {
			Object o = list.get(i);
			String s = (String)o;
			System.out.println(s.toUpperCase());
		}
		
		System.out.println("��������");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			String s = (String)o;
			System.out.println(s.toUpperCase());
		}
		
		System.out.println("for-each����");
		for(Object o : list) {
			String s = (String)o;
			System.out.println(s.toUpperCase());
		}
		
		
		/*
		int[] a = {1,2,3,4,5};
		for(int b : a) {
			System.out.println(b);
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			int b = a[i];
			System.out.println(b);
		}*/
	}
	

}
/*
class MyList{
	private Object[] os = new Object[3];
	private int index;  // ��¼��������ЧԪ�صĸ���, ͬʱҲ��Ԫ�ص��±귶Χ  0 - index-1
	
	//��Ԫ��o��ӵ������ĩβ
	public void add(Object o) {
		if (os.length == index) expand();
		os[index] = o;
		index++;
	}
	
	//��Ԫ��o���뵽�����pos�±���
	public void add(int pos , Object o) {
		if (os.length == index) expand();
		for(int i = index ; i > pos ; i--) {
			os[i] = os[i-1];
		}
		os[pos] = o;
		index++;		
	}
	//�������䳤��
	private void expand() {
		Object[] os2 = new Object[os.length*2];
		for(int i = 0 ; i < os.length ; i++) {
			os2[i] = os[i];
		}
		os = os2;
	}
	
	//�����������ЧԪ�صĸ���
	public int size() {
		return index;
	}
	//���������pos�±��Ԫ��
	public Object get(int pos) {
		return os[pos];
	}
	
}
*/