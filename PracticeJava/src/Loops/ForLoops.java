package Loops;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i;
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
			for (int j=0; j<=i; j++) {
				System.out.println("Inside j");
				for (int k=0; k<=j; k++) {
					System.out.println("Inside k**");
					
				}
			}
		}
		//System.out.println(i);
	System.out.println("This is how (nested) for-loop works!");
	}
} 

// While -> When number of iteration are unknown 
// For loop -> When number of iteration are known 
// Do While -> same as "while loop" but it gets executed at least once irrespective of the condition