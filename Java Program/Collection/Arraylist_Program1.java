package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1= new ArrayList();
		a1.add(6984);
		a1.add('m');
		a1.add("bjqfe");

		a1.add(false);

		a1.add(34.455);
		a1.add(6984);
		a1.add('m');
		a1.add("bjqfe");

		a1.add(false);

	

		a1.add(0);

		a1.add(null);

		System.out.println(a1);
		ArrayList a2= new ArrayList();
		a2.add(6984);
		a2.add(586);
		a2.add(2755);

		a2.add(455);
		Collections.sort(a2);
		System.out.println(a2);
	}

}
