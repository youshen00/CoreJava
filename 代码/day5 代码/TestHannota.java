package day5;
public class TestHannota{
	public static void main(String[] args){
		
		/*
		�ƶ�n������  ��A��B ����C  - ������
		  --->  �ƶ� n-1 ������  ��A��C ����B   - С����
		  --->  �������� ��A��B                 - ��������
		  --->  �ƶ� n-1 ������  ��C��B ����A   - С����
		*/
		
		transfer(4,'A','B','C');
	}
	
	//��n������, ��from�Ƶ�to,����temp
	static void transfer(int n , char from , char to , char temp){
		//��������
		if (n == 0 ) return ;
		
		//�� n-1������ ��from �Ƶ� temp ����to
		transfer(n-1, from , temp , to);
		
		// �������Ӵ�from�Ƶ�to
		System.out.println(from + "----->" + to);
		
		//�� n-1������, ��temp�Ƶ� to ���� from
		transfer(n-1 , temp , to , from);
	}
}
