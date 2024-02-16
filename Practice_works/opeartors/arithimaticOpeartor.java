package opeartors;

public class arithimaticOpeartor {

	public static void main(String[] args) {
		// addition 
		int a,b,c;
		a=25;
		b=30;
		c=a+b;
		System.out.println(" Addition: " + c);
//		subtraction
		int x,y;
		x=50;
		y=27;
		System.out.println(" Subtraction: " + (x-y));
//		Multiplication
		int l ,m;
		l=167;
		m=45;
		System.out.println(" Multiplication: " + (l*m));
//		division
		int n,o,p;
		n=156;
		o=13;
		p=n/o;
		System.out.println(" Division: " + p);
//		modules
		int d,e;
		d=35;
		e=15;
		System.out.println(" Modules: " + (d%e));
		
//		swap of two numbers
		int a1 = 5;
		int b1 = 10;

		a1 = a1 + b1;
		b1 = a1 - b1;
		a1 = a1 - b1;

		System.out.println("The value of a after swapping: " + a1);
		System.out.println("The value of b after swapping: " + b1);
		
		

	}

}
