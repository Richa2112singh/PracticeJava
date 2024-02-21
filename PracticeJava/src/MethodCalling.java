
public class MethodCalling {
	
	// Non-Static Methods -> // Non-static Method can call Static Method 
	public void show1() {
		System.out.println("Inside show 1");
		show2();   // call method form another method
	}
	
	public void show2() {
		System.out.println("Inside show 2");
		show3();
	}


	public void show3() {
		System.out.println("Inside show 3");
		//statMethod ();
	}
	
	// Static Method can not call Non-static Method 
	public static void statMethod () {
		System.out.println("Inside Stat Method");
	//	show3();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodCalling obj= new MethodCalling ();
		obj.show1();
		statMethod ();
		obj.show2();
		obj.show3();
		
		

	}

}
