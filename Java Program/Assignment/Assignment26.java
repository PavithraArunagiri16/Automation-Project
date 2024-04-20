package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uplist Treeset to Set
		 Set a2 =new TreeSet();
				a2.add(6984);//Store index oder
				a2.add(586);
				a2.add(586);//duplicate will applicable
				//a2.add("Store hetrogeneous");
			//	a2.add("can follow the insertion order");
	            //a2.add(null);
				//a2.add(null);// add n number of null
			 
				System.out.println(a2.size());
				System.out.println(a2.contains(586));
				System.out.println(a2.isEmpty());
				Iterator list =a2.iterator();//display one by one in forwaord direction
				while(list.hasNext()){
					System.out.println(list.next());
				}
				
			
				
				

		}

	}
	


