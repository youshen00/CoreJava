package day8;
class TestEncapsulation{
	public static void main(String[] args){
		CreditCard card = new CreditCard();
		
		//System.out.println(card.password);
		System.out.println(card.getPassword());
		
		//card.password = "1234";
		card.setPassword("1234");
		
		//System.out.println(card.password);
		System.out.println(card.getPassword());
	}
}
public class CreditCard{
	private String password = "123456";
	public String getPassword(){
		return password;
	}
	private void setPassword(String password){
		if (password.length() !=6) return;
		this.password = password;
	}
}









