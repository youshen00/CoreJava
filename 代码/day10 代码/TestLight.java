package day10;
public class TestLight{
	public static void main(String[] args){
		Light light = new Light();
		RedBulb bulb1 = new RedBulb();
		light.setBulb(bulb1);
		light.powerOn();	

		YellowBulb bulb2 = new YellowBulb();
		light.setBulb(bulb2);
		light.powerOn();
	}
}

class Light{
	private Bulb bulb = null;
	public void setBulb(Bulb bulb){
		this.bulb = bulb; 
	}
	public void powerOn(){
		bulb.shine();
	}
}
abstract class Bulb{
	public abstract void shine();
}
class RedBulb extends Bulb{
	public void shine(){
		System.out.println("发出红光");
	}
}
class YellowBulb extends Bulb{
	public void shine(){
		System.out.println("发出黄光");
	}
}	