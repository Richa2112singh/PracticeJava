package Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//DB connection
			//executes DB queries
			//validating some data
			//closing DB connection
			System.out.println("inside try block");
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("Exception occurred");
		} finally {
			//to close the DB connection 
			System.out.println("closed connection");
		}

	}

}
