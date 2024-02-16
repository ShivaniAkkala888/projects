package UserInput;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// step 2 :Using Scanner for Getting Input from User
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a string: " );
        String name = input.nextLine(); // string input
        System.out.println("You entered string: " + name);
 
        int age = input.nextInt(); // integer input
        System.out.println("You entered integer: " + age);
 
        float percentage = input.nextFloat(); // float input
        System.out.println("You entered float: " + percentage);
        
        // Closing to avoid memory leak.
        input.close();

	}

}
