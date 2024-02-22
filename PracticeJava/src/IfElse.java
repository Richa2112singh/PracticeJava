
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int) (Math.random()*10);
		System.out.println(num);
		
		if (num>5) {
			System.out.println("Greater than 5"); 
		    System.out.println("Still Greater than 5");
	    }
		
		else if (num<3) {
			System.out.println("lesser than 3");
		}
		else {
			System.out.println("Less than 5");
        }
	}

}
