
public class Methods {
	
	//Declaration -> Define
	public int add(int num, int num2) {        //Addition
		int sum = num + num2;
		System.out.println("Addition is "+ sum);
		
		return sum; // Last statement of your method 
		
	}
	
	public void test() {    // <-Method execution/call
		System.out.println("Inside test Method");
		
		Methods obj = new Methods();
		int  addition = obj.add(50, 10);
		
		Methods obj2 = new Methods();
		int  subtraction = obj2.sub(50, 10);
		
		Methods obj3 = new Methods();	
		String S4 = obj3.concat("Hi" , 'C');
	}
	
	public int sub(int numb, int numb2) {           // Subtraction 
		int subt = numb - numb2;
		System.out.println("Subtraction is "+subt);
		return subt; // Last statement of your method 
	}
	
	public String concat(String S1 , char S2) {      // String 	
		String S3 = S1+S2;	
		System.out.println("String is" + S3);
		
//		Methods obj3 = new Methods();	
//		String S4 = obj3.concat("Hi" , 'C');
//		System.out.println(S4); 
//		
		return S3; // Last statement of your method 
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; // Declaration
		a=10;  // Initialization 
		
		Methods obj = new Methods();
		Methods obj2 = new Methods();
		obj.test();
		obj.concat(" trt ", 'd');


	}
	
	
	
		
	}
