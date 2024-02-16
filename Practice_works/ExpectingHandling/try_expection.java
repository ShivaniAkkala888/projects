package ExpectingHandling;

public class try_expection {

	public static void main(String[] args) {
		int num1,num2;
		try {
			/*
			 * We suspect that this block of statement can throw exception so we handled it
			 * by placing these statements inside try and handled the exception in catch
			 * block
			 */
			num1 = 5;
			num2 = 62/num1;
			System.out.println(num2);
			System.out.println(" Hey I am at the end of try block ");
		}
		catch (ArithmeticException ex) {
			/*
			 * This block will only execute if any Arithmetic exception occurs in try block
			 */
			System.out.println("can not divide a number by Zero");
		}
			

			
		

	}

}
