package projects;

import java.util.*;
import java.io.*;
public class Menudriven {

public static void main(String[] args) {
// TODO Auto-generated method stub
      int choice;
int productquantity;
      String productname;
      char[] arr= new char[9];
      do {
      System.out.println("Enter your Choice:\n 1.Save\n 2.Display\n 3.Delete\n");
      Scanner sc=new Scanner(System.in);
      Scanner sc1=new Scanner(System.in);
     
      choice=sc.nextInt();
     
     
     switch(choice) {
     case 1: System.out.println("Enter the product name:");
     productname=sc1.nextLine();
     System.out.println("Enter Product quantity:");
     productquantity=sc.nextInt();
     try {
     FileWriter fw=new FileWriter("products.txt");
     //boolean value=fw.createNewFile();
     fw.write(productname);
     fw.write(":"+String.valueOf(productquantity));
     fw.close();
     fw.close();
   
     System.out.println("Products have been successfully added to the list.");
     }
     catch(Exception e) {
     System.out.println("File error");
     }
     System.out.println("Enter the next choice:");
     
     break;
     case 2:
    try {
        FileReader file=new FileReader("products.txt");
        file.read(arr);
        System.out.println("Displaying File Content:");
        System.out.println(arr);
        file.close();
    }
    catch(Exception e) {
    System.out.println("Error");
    }
    break;
     case 3:System.out.println("Deleting data from file:");
     break;
     default :System.out.println("Please enter a valid input!");
     }
     
}while(choice!=0);
}
}

