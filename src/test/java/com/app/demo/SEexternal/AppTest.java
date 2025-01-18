package com.app.demo.SEexternal;

import java.util.Scanner;
public class AppTest
{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the first number: ");
	   double num1 = sc.nextDouble();

	   System.out.print("Enter the second number: ");
       double num2 = sc.nextDouble();        
       
       System.out.println("1. Add");
       System.out.println("2. Subtract");
       System.out.println("3. Multiply");
       System.out.println("4. Divide");

       // Get user choice
       int choice = sc.nextInt();
       double result; 
       
       switch (choice) {
       case 1:
           result = num1 + num2;
           break;
       case 2:
           result = num1 - num2;
           break;
       case 3:
           result = num1 * num2;
           break;
       case 4:
           if (num2 != 0) {
               result = num1 / num2;
           } else {
               System.out.println("Error: Division by zero is not allowed.");
               return;
           }
           break;
       default:
           System.out.println("Invalid choice.");
           return;
   }
       System.out.println("The result is: " + result);

   }
}
