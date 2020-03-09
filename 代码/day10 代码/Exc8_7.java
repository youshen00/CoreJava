package day10;
public class Exc8_7{
	public static void main(String[] args){
		Animal[] as = {new Dog(),new Cat(),new Dog(),new Dog(),new Cat()};
		Dog[] ds = getAllDogs(as);
	}
	public static Dog[] getAllDogs(Animal[] as){
		//统计as数组中Dog对象的个数 n
		int n = 0 ; 
		for(int i = 0 ; i < as.length ; i++){
			if (as[i] instanceof Dog) n++;
		}
		
		Dog[] ds = new Dog[n];
		
		//把as数组中的Dog对象放入ds数组
		int c = 0 ; 
		for(int i = 0 ; i < as.length ; i++){
			if (as[i] instanceof Dog){
				//将 as[i]放入 ds数组中
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
