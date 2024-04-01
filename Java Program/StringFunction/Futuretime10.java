package StringFunction;

import java.util.Date;

public class Futuretime10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Date d1= new Date();
System.out.println(d1.getTime()); //Machine time
Date d2= new Date(d1.getTime());//Human time

System.out.println(d2);
Date d3=new Date(d1.getTime()+(1000*60*60*24*10));
System.out.println(d3);




	}

}
