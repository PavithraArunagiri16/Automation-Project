package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList t=new ArrayList();
		t.add(25);
		t.add(1);
		t.add(89);
		t.add(25578);
		t.add(357);
		t.add(25);
		System.out.println(t);
		
		System.out.println("---Iterate from iterator---");
		Iterator i=t.iterator();
		while(i.hasNext()==true)
	    {
		    System.out.println(i.next());	
		}
		
	System.out.println("/ list Iterator/");
		ListIterator list1 =t.listIterator(); //return type ListIterator(I)
		
		while(list1.hasNext()){
			System.out.println(list1.next());
		}
		t.clear();
		
	}
}
	


