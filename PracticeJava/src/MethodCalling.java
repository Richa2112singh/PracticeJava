
public class MethodCalling {
	
	// Non-Static Methods ->
	public void show1() {
		System.out.println("Inside show 1");
		show3();   // call method form another method
	}
	
	public void show3() {
		System.out.println("Inside show 3");
		show2();
	}


	public void show2() {
		System.out.println("Inside show 2");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodCalling obj= new MethodCalling ();
		obj.show1();
		obj.show2();
		obj.show3();

	}

}
