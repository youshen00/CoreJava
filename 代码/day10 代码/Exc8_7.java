package day10;
public class Exc8_7{
	public static void main(String[] args){
		Animal[] as = {new Dog(),new Cat(),new Dog(),new Dog(),new Cat()};
		Dog[] ds = getAllDogs(as);
	}
	public static Dog[] getAllDogs(Animal[] as){
		//ͳ��as������Dog����ĸ��� n
		int n = 0 ; 
		for(int i = 0 ; i < as.length ; i++){
			if (as[i] instanceof Dog) n++;
		}
		
		Dog[] ds = new Dog[n];
		
		//��as�����е�Dog�������ds����
		int c = 0 ; 
		for(int i = 0 ; i < as.length ; i++){
			if (as[i] instanceof Dog){
				//�� as[i]���� ds������
				ds[c] = (Dog)as[i]; 
				c++;
			}
		}
		
		return ds;
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
