package day4;
public class Exc4_15{
	public static void main(String[] args){
		int n = 10;
		for(int i = 0 ; i < n ; i++){
			//��ӡһ��
			//�ȴ�ӡ i��1
			for(int j = 1 ; j <= i ; j++){
				System.out.print(1+"\t");
			}
			//ѭ����ӡ����
			for(int j = 1 ; j <= n-i ; j++){
				System.out.print(j+"\t");
			}
			//����
			System.out.println();
		}
	}
}