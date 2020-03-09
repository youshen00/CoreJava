package day9;
public class TestPloy{
	public static void main(String[] args){
		Animal[] a= new Animal[5];
		
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Tiger();
		a[3] = new Wolf();
		a[4] = new Cock();
		
		for(int i = 0 ; i < a.length ; i++){
			a[i].eat();
		}
		
		feed(new Dog());
		feed(new Cat());
		
		Animal an = getAnimal();
	}
	static void feed(Animal a){
		a.eat();
	}
	static Animal getAnimal(){
		return new Cat();
	}
}

class Animal{
	public void eat(){}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("Dog eats bone");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("Cat eats fish");
	}
}
class Tiger extends Animal{
	public void eat(){
		System.out.println("Tiger eats human");
	}
}
class Wolf extends Animal{
	public void eat(){
		System.out.println("Wolf eats sheep");
	}
}
class Cock extends Animal{
	public void eat(){
		System.out.println("Cock eats worm");
	}
}
