package day6;
public class Exc6_$3{
	
	// a[i]  ��i�еĻʺ�, ���ڵ�a[i]��   	
	static int[] a = new int[8];
	
	public static void main(String[] args){
		place(0);
	}
	
	// ���õ�n�еĻʺ�  Ϊa[n]��ֵ 
	static void place(int n){
		//��ӡ���, ����
		if (n == 8) {
			for(int i = 0 ; i < a.length ; i++){
				System.out.print(a[i]+"\t");
			}
			System.out.println();
			return;
		}
		
		//���� ��0��-��7��
		outer:for(a[n] = 0 ; a[n] <= 7 ; a[n]++){
			//�����ǰ���ĳ���ʺ��г�ͻ, �ͳ�����һ��
			for(int j = 0 ; j < n ; j++){
				//�ж� a[j]��a[n]�Ƿ��ͻ
				if (a[j] == a[n] || a[j]-a[n]==j-n || a[j]-a[n] == n-j) 
					continue outer;
			}
			//�����ǰ������лʺ�û��ͻ, ���õ�n+1�еĻʺ�
			place(n+1);
		}
	}
}








