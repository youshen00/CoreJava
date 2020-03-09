package day14;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		java.util.Scanner s = new Scanner(System.in);
		String name = s.next();
		String pass = s.next();
		String tel = s.next();
		User u1 = new User(name,pass,tel);
		
		
		String name2 = s.next();
		String pass2 = s.next();
		String tel2 = s.next();
		User u2 = new User(name2,pass2,tel2);		
		
		
		
	}
	
	
	private String username;
	private String password;
	private String tel;
	
	public User() {
		super();
	}
	public User(String username, String password, String tel) {
		super();
		this.username = username;
		this.password = password;
		this.tel = tel;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString () {
		return "username : "+this.username+",password : "+this.password+" , tel = "+tel;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		User u = (User) o;
		// 逐个比较属性
		if (this.username.equals(u.username) && this.password.equals(u.password) &&  this.tel.equals(u.tel))
			return true;
		else return false;
	}
}
