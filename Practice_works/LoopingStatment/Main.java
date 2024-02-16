package LoopingStatment;


		
		import java.util.Scanner;

		public class Main {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        int choice;
		        double num1, num2, result;

		        while (true) {
		            System.out.println("Enter your choice:");
		            System.out.println("1. Addition");
		            System.out.println("2. Subtraction");
		            System.out.println("3. Multiplication");
		            System.out.println("4. Division");
		            System.out.println("5. Exit");

		            choice = input.nextInt();

		            if (choice == 5) {
		                System.out.println("Exiting...");
		                break;
		            }

		            System.out.println("Enter two numbers:");
		            num1 = input.nextDouble();
		            num2 = input.nextDouble();

		            switch (choice) {
		                case 1:
		                    result = num1 + num2;
		                    System.out.println(num1 + " + " + num2 + " = " + result);
		                    break;
		                case 2:
		                    result = num1 - num2;
		                    System.out.println(num1 + " - " + num2 + " = " + result);
		                    break;
		                case 3:
		                    result = num1 * num2;
		                    System.out.println(num1 + " * " + num2 + " = " + result);
		                    break;
		                case 4:
		                    result = num1 / num2;
		                    System.out.println(num1 + " / " + num2 + " = " + result);
		                    break;
		                default:
		                    System.out.println("Invalid choice!");
		                    break;
		            }
		        }
		    }
		

	}


