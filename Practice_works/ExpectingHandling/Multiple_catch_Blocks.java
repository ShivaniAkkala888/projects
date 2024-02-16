package ExpectingHandling;

public class Multiple_catch_Blocks {

	public static void main(String[] args) {
		try {
			int a[] = new int[7];
			a[14]= 4/0;
		}catch (ArithmeticException e) {
			System.out.println("Warning : ArithmeticException");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning : ArrayIndexOutOfBoundsException");
		}
		System.err.println("Out of try-catch block...");

	}

}
