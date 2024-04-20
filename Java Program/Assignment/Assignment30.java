package Assignment;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v1 = new Vector();  
		v1.add("Emma");  
		v1.add("Adele");  
		v1.add("Aria");  
		v1.add("Aidan");  
		v1.add("Adriana");  
		v1.add("Ally");  
		// System.out.println(v1);
		Enumeration em=v1.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
	}

}
