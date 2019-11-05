import java.util.*;

/*
* Lab 4
* Description: While Loop
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/
/**
 *
 * This program prints the multiplication table for any integer between 1 & 12.
 */       


public class Lab4_While {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in); //new scanner object
        
       System.out.print("Please enter any number 1-12: ");
       int var1 = input.nextInt();
       
       
      
       if(var1 < 13 && var1 > 0)
       {
       System.out.println("Now printing the Multiplications Table for the number: " + var1);
       for(int i = 1; i <= 10; ++i) // a for loop seems like the easiest option. for each integer 1-10 the loop multiplies it by i++ and prints the solution.    
           
        {
            System.out.println(var1 + "x" + i +"=" + var1*i); //takes user input, multiplies it by i and prints the solution.
        }
       }
       else
        {
           System.out.println("Please enter a number between 1 and 12.");
        }
    }
}

        
    
