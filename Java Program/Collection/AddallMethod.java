package Collection;

import java.util.ArrayList;

public class AddallMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a= new ArrayList();
a.add("kavi");
a.add("kani");
a.add("kani1");
System.out.println(a);
System.out.println(a.contains("hi"));
System.out.println(a.remove("Kani1"));
//is empty
//clear
//size

ArrayList b= new ArrayList();
b.addAll(a);
b.add("kavi");
b.add("kani");
System.out.println(b);
System.out.println(b.containsAll(b));
//System.out.println(b.removeAll(b));


	}

}
