package StringFunction;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int age[]=new int[4];
		age[0]=67;
		age[1]=9;
		age[2]=56;
		age[3]=6;
		/*System.out.println(age[0]);
        System.out.println(age[1]);
		System.out.println(age[2]);
        System.out.println(age[3]);*/
        for(int i=0;i<4;i++)
        {
		// TODO Auto-generated method stub
        //System.out.println(age[0]);
        System.out.println(age[i]);

        }
        System.out.println("one more way to print Array");

		//System.out.println(age.toCharArray());
        System.out.println(Arrays.toString(age));
        

	}

}
