package StringFunction;

public class Arraycheckno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[4];
		 number[0]=5;
				 number[1]=6;
				 number[2]=3;
				 number[3]=2;
				 int checkno=6;
				 
				 for (int i=0;i<number.length;i++)
				 {
					 if(number[i]==checkno)
					 {
						 System.out.println("Array consist of number 6" + "at the index" +i);
					 }
					 else
					 {
				//		 System.out.println("Array not consist of number 6" +"at the index" +i);
					 }
					 
				 }

	}

}
