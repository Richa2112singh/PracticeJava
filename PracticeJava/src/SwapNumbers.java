
public class SwapNumbers {
	
	public void SwapNum (int num1, int num2) {
		System.out.println("Intitail Value of num1 is "+ num1 + ", Initial value of num2 is "+ num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swaping num1 is "+ num1);
		System.out.println("After Swaping num2 is "+ num2);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapNumbers obj = new SwapNumbers ();
		obj.SwapNum(7, 9);
		
				

	}

}
