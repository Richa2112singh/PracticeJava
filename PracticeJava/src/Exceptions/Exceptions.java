package Exceptions;

public class Exceptions {

	public static void main(String[] args)  throws Throwable {    // with throwable we can write Thread.sleep N number of times S
		// TODO Auto-generated method stub
// Exceptions : logically incorrect statement 
		
		System.out.println("Start of Script");
		
		try {
			System.out.println(10/0);
		} catch (Throwable t) {
			System.out.println("Exception occured");
			System.out.println(t.getMessage());
			t.printStackTrace();		
		}
			
		System.out.println("End of Script");
		try {
			Thread.sleep(100);               // Thread.sleep
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Final end of Script");
		Thread.sleep(1000);                       // Thread.sleep --> add throws declaration 
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
	}

}
