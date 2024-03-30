package AccesessModifier2;

import AccessModifier1.ClassA;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA obj = new ClassA();
		obj.add();
		
	//	ClassB obj2 = new ClassB();     --> Not accessible as ClassB has default modifier 
	//	obj2.sub();
		

	}

}
