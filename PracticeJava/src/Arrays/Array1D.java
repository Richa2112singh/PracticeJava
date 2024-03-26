package Arrays;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int [5];
		String [] strArray = new String [7];
		int [] array1 = {10,20,30,40,50,60,70,80};
		String [] strArray1 = {"purple","black","grey"};
		
		//System.out.println(array.length);
		//System.out.println(strArray.length);
		
	//	array[0] = 10;
	//	array[1] = 20;
	//	array[2] = 30;
	//	array[4] = 50;
		
		// System.out.println(array[4]);
		
		for ( int i=0; i<array.length; i++) {
			array [i]= i*5;
		}
		
		//for (int i=0; i<array.length; i++) {
		//	System.out.println(array[i]);
	//	}
		
		for (int i:array1) {                                        //Advance for loop 
			System.out.println(i);
		}
		
// reverse printing array 
		//for (int i=array.length-1; i>=0; i--) {                   
		//	System.out.println(array[i]); 
	//	}
				

	}

}
