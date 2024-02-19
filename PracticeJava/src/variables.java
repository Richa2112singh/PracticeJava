
public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration
		int i= 123456789;  //integer value ->initializing variable 
		float f= 1.2345f; //Decimal values
		double d= 6.78901112131415; //Long decimal
		long l= 123456789011121314l; //Long integer
		boolean b= true; //True or False 
		char c= 'R'; //Single Character
		
		String s= "Richa" ;
		String name;
		name = "Richa";
		String name2;
		name2 = "Rich";
		variables v; // Reference Variable -> Non-primitive Data type 
		
		//camel casing -> a way of combining more than two words in to a single word(capitalizing initial letter of each word)
		String AdressPune;
		String  AdressPuneViaMumbai;
		
		String S1 = "Hey ";
		String S2 = "It's ";
		String S3 = "Sunday!!";
		
		String S4 = S1+S2+S3;                           //String concatenation 
		System.out.println(S4);                        //Hey It's Sunday!!
		System.out.println(S1+S2+"it's me "+S3);      //Hey It's it's me Sunday!!
		
		int num1= 10;
		int num2= 20;
		
		int num3= num1+num2;
		System.out.println(num3);                       //30
		System.out.println(num1+num2);                 //30
		System.out.println(num1+num2+S1);             //30Hey 
		System.out.println(S2+num1+num2+S1);         //It's 1020Hey------when we write Integers with String, it is treated as a string 
		System.out.println(S2+(num1+num2)+S1);      //It's 30Hey 
		
		
		
		//Java Operator
		//12 + 40 Operands 
		//Unary Operator -> +
		//Binary Operator -> ++ i++,i--,++i
		//Teranary Operator -> +++
		 

		//-> Equality and Relations Operator
		System.out.println(30==30);     //Equal to 
		System.out.println(30!=30);    //Not Equal to
		System.out.println(30>30);     //Greater than
		System.out.println(30<30);      //Less than
		System.out.println(30>=30);     //Grater than or Equal to
		System.out.println(30<=30);     //Less than or Equal to

		//-> Conditional Operators
		System.out.println((30<20) && (30>40));     //conditional - And 
		System.out.println((30>20) || (30>40));     //conditional - Or
		
		boolean con= !false;
		System.out.print(con);       // print -> True
		
		boolean cond= !true;
		System.out.print(cond);       // print -> False
		System.out.println(true && true);    // using conditionals with boolean
		
	
		
		}
	}


