package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uplist Array list to list iterators
	 List a2 =new ArrayList();
			a2.add(6984);//Store index oder
			a2.add(586);
			a2.add(586);//duplicate will applicable
			a2.add("Store hetrogeneous");
			a2.add("can follow the insertion order");
            a2.add(null);
			a2.add(null);// add n number of null
		    System.out.println(a2.remove(4));
			System.out.println(a2.get(4));
			System.out.println(a2.set(4, "kani"));
			System.out.println(a2.size());
			System.out.println(a2.contains("Store Hetrogeneous"));
			System.out.println(a2.indexOf(null));
			Iterator list =a2.iterator();//display one by one in forwaord direction
			while(list.hasNext()){
				System.out.println(list.next());
			}
			ListIterator list1 =a2.listIterator();//display one by one in forwaord and backword direction
			while(list1.hasNext()){
				System.out.println(list1.next());
			}
			a2.clear();
			
			

	}

}
