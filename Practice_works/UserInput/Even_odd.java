package UserInput;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = Scanner.nextInt();
		if(n%2==0) {
			System.out.println("The Given Number is Even Number ");			
		}
		else {
			System.out.println("The Given Number is Odd Number ");
		}
		
	}

}
