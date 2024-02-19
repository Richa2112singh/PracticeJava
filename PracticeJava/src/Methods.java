
public class Methods {
	
	//Declaration -> Define
	public int add(int num, int num2) {        //Addition
		int sum = num + num2;
		
		return sum; // Last statement of your method 
		
	}
	
	public void test() {    // <-Method execution/call
		System.out.println("Inside test Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; // Declaration
		a=10;  // Initialization 
		
		Methods obj = new Methods();
		obj.test();
	//	int addition = obj.add(5, 10);
	//	System.out.println(addition);
		
		System.out.println(obj.add(50, 10));

	}

	public int sub(int numb, int numb2) {           // Subtraction 
		int subt = numb - numb2;
		
		Methods obj2 = new Methods();
		int subtraction = obj2.sub(50, 10);
		System.out.println(subtraction);
		
		return subt; // Last statement of your method 
	}

		
	
	public String concat(String S1 , char S2) {      // String 	
		String S3 = S1+S2;	
		
		Methods obj3 = new Methods();	
		String S4 = obj3.concat("Hi" , 'C');
		System.out.println(S4); 
		
		return S3; // Last statement of your method 
	}		
		
	}
