package misc;

public class TypeCasting {
	public static void main(String[] args) {
		byte a=10;
		byte b=a;
		byte c= (byte) (a+b);
		System.out.println("Sum of two numbers :"+c);
		
		System.out.println(" Explicit : ");
		
//		Explicit type casting
		double d =57.14;
		
		int i = (int)d;//Explicit casting from long to int data type
		System.out.println("The double data type : " + d);
		System.out.println("The int data type : " + i);
		
		
		System.out.println(" Implicit : ");
		
		
//	implicit  type casting 
		float x = 10 ;
		int p = 20;
		long q = p;//implicit casting from int to long data type 
		double r = q;//implicit casting from long to double data type
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
	}

}
