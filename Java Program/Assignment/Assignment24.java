package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Assignment24 {
	
	public static void main(String[] args) {
	arraylist();
	linkedlist();
	vector();
	priorityqueue();
	treeset();
	
	}
	public static void arraylist() {
		// TODO Auto-generated method stub
		ArrayList a2= new ArrayList();
		a2.add(6984);//Store index oder
		a2.add(586);
		a2.add(586);//duplicate will applicable

		a2.add("Store hetrogeneous");
		a2.add("can follow the insertion order");

		a2.add(null);
		a2.add(null);// add n number of null
		//Collections.sort(a2); used under homogeneous values
		//Collections.sort(a2,Collections.reverseOrder());
		System.out.println(a2);
		
	}
	public static void vector() {
		Vector V= new Vector();
		V.add(6984);//Store index oder
		V.add(586);
		V.add(586);//duplicate will applicable

		V.add("Store hetrogeneous");
		V.add("can follow the insertion order");

		V.add(null);
		V.add(null);// add n number of null
	
		System.out.println(V);
		
		
	}


	public static void linkedlist() {
		// TODO Auto-generated method stub
	LinkedList LV= new LinkedList();
		LV.add(6984);//Store index oder
		LV.add(586);
		LV.add(586);//duplicate will applicable

		LV.add("Store hetrogeneous");
		LV.add("can follow the insertion order");

		LV.add(null);
		LV.add(null);// add n number of null
		//Collections.sort(a2); used under homogeneous values
		//Collections.sort(a2,Collections.reverseOrder());
		System.err.println(LV);
		
	}

	public static void treeset() {
		// TODO Auto-generated method stub
		TreeSet TS= new TreeSet();
		TS.add(6984);//Store index oder
		TS.add(586);
		//TS.add(586);//duplicate will applicable

		//TS.add("Store hetrogeneous");
		//TS.add("can follow the insertion order");

		//TS.add(null);// add 1 number of null
		//TS.add(null);
	
		System.out.println(TS);
		
	}
	

	public static void priorityqueue() {
		// TODO Auto-generated method stub
		PriorityQueue PQ= new PriorityQueue();
		PQ.add(6984);//Store index oder
		PQ.add(586);
		PQ.add(586);//duplicate will applicable

		//PQ.add("Store hetrogeneous");
		//PQ.add("can follow the insertion order");

	//	PQ.add(null);
		//PQ.add(null);// add n number of null
		//Collections.sort(a2); used under homogeneous values
		//Collections.sort(a2,Collections.reverseOrder());
		System.out.println(PQ);
	
		
	}

	

	


}