package UserInput;

import java . util .Scanner; 

public class console {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System .out.println("What is your Name?");
		
		String name = Scanner.nextLine();
		System.out.println("Hey"+ "How are You?"+name);
		String Status = Scanner.nextLine();
		System.out.println("What is your age?");
		int age = Scanner.nextInt();
		System.out.println("Thankyou for the Information?");
		
		Scanner.close();
		
		

	}

}
