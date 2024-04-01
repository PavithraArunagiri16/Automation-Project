package Encapsulation;
class login
{
	private String emailid="Pavigiri@gmail.com";//default emai id of the system for the customer
	public String getEmailid() {
		return emailid;
	}
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	private String password="kani";
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	private int age=18;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}




	
	}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login l1= new login();
		l1.setEmailid("123@maildrop.cc");
		System.out.println(l1.getEmailid());
		l1.setPassword("qffef");
		System.out.println(l1.getPassword());
		l1.setAge(24);
		System.out.println(l1.getAge());
	

	}

}
