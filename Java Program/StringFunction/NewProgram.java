package StringFunction;

public class NewProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] a1 = null; 
	        char[] b = null;
	        int[] c = null;
	        int[] d = null;
	        
	        int[] Rollno = {001, 002, 003, 004};
	        String[] StudentName = {"Ram", "Sita", "Lak", "Ayoth"};
	        char[] Gender = {'M', 'F', 'M', 'M'};
	        int[] Phone = {5894684, 5894687, 5894681, 5894683};
	        
	        System.out.println("StudentName    Gender    Rollno    Phoneno");

	        for (int i = 0; i < StudentName.length; i++) {
	            a1 = StudentName;
	            b = Gender;
	            c = Phone;
	            d = Rollno;

	            System.out.println(a1[i] + "    " + b[i] + "    " + c[i] + "    " + d[i]);
	        }
	}

}
