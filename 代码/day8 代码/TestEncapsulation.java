package day8;
class TestEncapsulation{
	public static void main(String[] args){
		CreditCard card = new CreditCard();
		
		System.out.println(card.password);
		card.password = "654321";
		System.out.println(card.password);
	}
}
public class CreditCard{
	String password = "123456";
}
