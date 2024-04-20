package Assignment;

import java.util.ArrayList;
import java.util.Collection;


public class Assignment27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Collection a2 =new ArrayList();
			a2.add(6984);//Store index oder
			a2.add(586);
			a2.add(586);//duplicate will applicable
			a2.add(458);
			a2.add("can follow the insertion order");
			System.out.println(a2);
			 Collection a =new ArrayList();
				a.add(66984);//Store index oder
				a.add(6586);
				a.add(6586);//duplicate will applicable
				a.add(6458);
				a.add("can follow the insertion order");
				System.out.println(a);
				a2.addAll(a);
				System.out.println(a2);
			    System.out.println(a2.containsAll(a));
				System.out.println(a2.isEmpty());
				System.out.println(a2.remove(586));
				System.out.println(a2.removeAll(a));
				System.out.println(a2.contains("Store Hetrogeneous"));
				System.out.println(a2.size());
				a2.clear();
         
	}

}
