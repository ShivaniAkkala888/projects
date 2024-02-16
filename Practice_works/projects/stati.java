package projects;

import java.util.Scanner;

public class stati {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in); 
  System.out.println("Well Come ATM ");
  System.out.println("**********************");
  System.out.println("Insert your ATM Card");
  System.out.println("Enter your PIN");
  int bal=60000;
  int num=sc.nextInt();
  if(num==1103) {
   System.out.println("1.For banking");
    System.out.println("2.For Balance Enquiry ");
   System.out.println("3.withdraw money");
   System.out.println("4.check statement");
   System.out.println("Please Select option");
   int input;
   Scanner scr=new Scanner(System.in);
   int num1=scr.nextInt();
   if(num1==1) {
    banking();
   }
  
   else if(num1==2) {
    balance_enquiry();
   }
   else if(num1==3) {
    withdraw();  
   }
   else if(num1==4) {
    statement();
   }
   else if(num1==5) {
    exit();
   }
   
   
   
  }

  else {
   System.out.println("Enter your valid pin");
   int num2=sc.nextInt();
   if(num==1103) {
    
   }
   
  }
  
  }
	
// CHECK YOUR BALANCE
 private static void balance_enquiry() {
  
  System.out.println("Enter your pin");
  Scanner scree=new Scanner(System.in);
  int num=scree.nextInt();
  if(num==1103) {
   
  }
  System.out.println("Your Account number is:*****2344");
  System.out.println("Your Balance is 60000");
   System.out.println("Thank You Visit Again");
         System.out.println("*********************");
      
   
 }
// WITHDRAW MONEY
 private static void withdraw() {
  System.out.println("Enter your money");
  Scanner with=new Scanner(System.in);
  
  int balance=60000;
  int num3=with.nextInt();
  if(num3<60000) {
   int rem=60000-num3;
  System.out.println(num3);
  System.out.println("Withdraw successfully");
  System.out.println("Please collect cash");
  System.out.println("Remaining balance is:"+rem);
  System.out.println("Thank you visit again");
  System.out.println("*************************");
  
  }
  else {
   System.out.println("Please check your balance");
  }
  balance_enquiry();
  }
  
  
  
	
 private static void statement() {
   System.out.println("Debited by upiid to *@ybl t0 500");
         System.out.println("999 Credited from bank ");
         System.out.println("700 debited through ATM in Anantapur");
         System.out.println("32 debited SMS charges");
         System.out.println("8000 transfered through upi");
         System.out.println("Thank You Visit Again");
         System.out.println("*********************");
     
  
 }
 private static void exit() {
  
 }
 private static void banking(){
   System.out.println("1:For Pin Change");
         System.out.println("2: For Sms Alert");
         System.out.println("3. Cash deposit");
         System.out.println("Please Select A Option");
         int option;
         Scanner aa=new Scanner(System.in);
          option=aa .nextInt();
          switch(option) {
          case 1:{
           System.out.println("Enter Your old pin NO ");
           int pas;
           Scanner aaa=new Scanner (System.in);
           pas=aaa.nextInt();
           if(pas==1103) {
           System.out.println("Please enter your new pin");
           int NEW;
           Scanner ae=new Scanner(System.in);
           NEW=ae.nextInt();
          System.out.println("Your pin was successfully changed");
          System.out.println("Thank you visit again");
            System.out.println("*********************");
           }
          break;
           }
          case 2:{
           System.out.println("Please Enter Your Mobile Number for Sms Alert");
           int num1;
           Scanner aaa=new Scanner(System.in);
         num1=aaa.nextInt();
           System.out.println("Your Mobile Number Is Sucesfully Updated ");
              System.out.println("Thank You Visit Again");
           System.out.println("*********************");
         break;
          }
          case 3:{
           System.out.println("Enter your money");
          }
    Scanner with=new Scanner(System.in);
   
   int balance=60000;
   int num3=with.nextInt();
   if(num3>60000) {
    int rem=60000+num3;
   System.out.println(num3);
   System.out.println("deposit successfully");
   System.out.println("Remaining balance is:"+rem);
   System.out.println("Thank you visit again");
   System.out.println("*************************");
   
           
          }

          
          default:{
           
           
          }
           
          }
  
 }
 }
