package StringFunction;

public class AverageString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number[]=new int[5];
		 number[0]=5;
				 number[1]=6;
				 number[2]=3;
				 number[3]=2;
				 number[4]=1;
		 int sum=0;
		 for(int i=0;i<number.length;i++)
		 {
			 sum= sum+number[i];
		 }
System.out.println(sum);
double average=sum/number.length;

System.out.println(average);
	}

}
