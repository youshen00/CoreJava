package day10;
public class TestLight2{
	public static void main(String[] args){
	}
}
class Light{
	private RedBulb bulb = null;
	public void setBulb(RedBulb bulb){
		this.bulb = bulb; 
	}
	public void powerOn(){
		bulb.faGuang();
	}
}
class RedBulb {
	public void faGuang(){
		System.out.println("发出红光");
	}
}
class YellowBulb {
	public void liang(){
		System.out.println("发出黄光");
	}
}	
