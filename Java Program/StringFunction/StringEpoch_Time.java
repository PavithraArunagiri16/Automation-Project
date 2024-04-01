package StringFunction;

import java.util.Date;

public class StringEpoch_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Date d1= new Date();
System.out.println(d1.getTime()); //Machine time
Date d2= new Date(d1.getTime());//Human time

System.out.println(d2);
Date d3=new Date(d1.getTime()+(1000*60*60*24*1));
System.out.println(d3);
Date d4=new Date(d1.getTime()-(1000*60*60*24*1));
System.out.println(d4);
String d31=d2.toString();
String month= d31.substring(4,7);
System.out.println(month);
String Date= d31.substring(8,10);
System.out.println(Date);

String year= d31.substring(d31.length()-5);
System.out.println(year);
System.out.println(year.concat("/").concat(Date).concat("/").concat(month));

	}

}
