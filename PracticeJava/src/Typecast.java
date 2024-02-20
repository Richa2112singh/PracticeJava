
public class Typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Predefined Method by java ->
//		Math.random();
//	->	Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
//  ->  useful for OTPs
			
	double randomNum = Math.random()*10;
	System.out.println(randomNum);
		
	double randomNum2 = Math.random()*100;
	System.out.println(randomNum2);

// Type Casting -> to get an integer value (decimal to integer)
	
	int randomNum3 = (int) (Math.random()*1000);
	System.out.println(randomNum3);	
	
	// Convert any data type into Integer->
	String RollNo = "21";
	System.out.println(RollNo + 5);
	int RollNoInt = Integer.parseInt(RollNo);
	System.out.println(RollNoInt + 5);
	
		

	}

}
