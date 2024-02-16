package projects;

import java.util.Scanner;

public class PowerBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        
        System.out.println("Enter units consumed:");
        double unitsConsumed = scanner.nextDouble();
        
        // Calculate bill
        double billAmount = calculateBill(unitsConsumed);
        
        // Output
        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: $" + billAmount);
        
        scanner.close();
    }
    
    public static double calculateBill(double unitsConsumed) {
        double billAmount = 0;
        
        // Assuming a simple calculation for the bill amount
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 0.10; // $0.10 per unit
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 0.10 + (unitsConsumed - 100) * 0.15; // $0.15 per unit after 100 units
        } else {
            billAmount = 100 * 0.10 + 100 * 0.15 + (unitsConsumed - 200) * 0.20; // $0.20 per unit after 200 units
        }
        
        return billAmount;
    }
}

