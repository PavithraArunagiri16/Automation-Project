package StringFunction;

public class RemovestringA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "ASDEFRaarathisaibaba";
		String output=name.replace('a',' ');
		System.out.println(output);
		String output1=name.replace('a','m');
		System.out.println(output1);
		String output2=name.replaceAll("[A-Z]","");
		System.out.println(output2);
		String output3=name.replaceAll("[a-z]","");
		System.out.println(output3);
		String name1= "aarathisaibaba 4817509";
		String output4=name1.replaceAll("[0-9]","");
		System.out.println(output4);
	}

}
