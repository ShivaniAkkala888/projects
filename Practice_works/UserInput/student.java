package UserInput;
import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Please Enter the Marks");
		int marks=Scanner.nextInt();
		if(marks<=35) {
			System.out.println("Pass");
			int marks1=Scanner.nextInt();
			if(marks<35&&marks>=70) {
				System.out.println("Third Rank");
				int marks2=Scanner.nextInt();
				if(marks<70&&marks>=85) {
					System.out.println("Second Rank");
					int marks3=Scanner.nextInt();
					if(marks<85&&marks>=100) {
						System.out.println("First Rank");
					}
					else {
						System.out.println("Fail");
					}
				}
				else {
					System.out.println("Fail");
				}
				
			}
			else {
				System.out.println("Fail");
			}
		}
		else {
			System.out.println("Fail");
		}

	}

}
