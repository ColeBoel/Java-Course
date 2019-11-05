import java.util.*;
import java.io.*;
/*
* Assignment 5
* Description: Method Menus
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/


/**
 *
 * 
 */    


public class Task {
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    boolean keepRunning = true;
    do{
  
       System.out.println("                    ----- Main Menu -----");
    System.out.print(
      "For invoking \"int max(intx, int y)\" function, enter A. \n"
    + "For invoking \"double max(double x,double y)\" function, enter B. \n"
    + "For invoking \"int min(intx, int y)\" function, enter C. \n"
    + "For invoking \"double min(double x, double y)\" function, enter D. \n"
    + "For invoking \"int power(int x, int y)\" function, enter E. \n"
    + "For invoking \"double power(double x, double y)\" function, enter F. \n  \n"
    + "For finishing the program, enter Z. \n \n"
    + "Enter your choice:   " );
    
    
    String methodChoice = input.next();
    
    if(methodChoice.equals("A"))
    {
        System.out.print("Enter your first integer value: ");
        int x = input.nextInt();
        System.out.print("Enter your second integer value: ");
        int y = input.nextInt();
        if(maxFunct(x,y) == 0){
            System.out.println("They are the same number");
        }
        else{
            System.out.println("The max integer value between among provided integers is " + maxFunct(x,y));
           System.out.println("\n \n \n");
            //keepRunning = true;
        }
        
        
    }
    else if(methodChoice.equals("B"))
    {
       System.out.print("Enter your first double value: ");
        double x = input.nextDouble();
        System.out.print("Enter your second double value: ");
        double y = input.nextDouble();
        if(maxFunct(x,y) == 0){
            System.out.println("They are the same number.");
        }
        else{
            System.out.println("The max double value between among provided doubles is " + maxFunct(x,y));
            System.out.println("\n \n \n");
            //keepRunning = true;
        }    
    }
     else if(methodChoice.equals("C"))
    {
        System.out.print("Enter your first integer value: ");
        int x = input.nextInt();
        System.out.print("Enter your second integer value: ");
        int y = input.nextInt();
        if(minFunct(x,y) == 0){
            System.out.println("They are the same number");
        }
        else{
            System.out.println("The min integer value between among provided integers is " + minFunct(x,y));
            System.out.println("\n \n \n");
            //keepRunning = true;
    }
    }
     else if(methodChoice.equals("D"))
    {
        System.out.print("Enter your first double value: ");
        double x = input.nextDouble();
        System.out.print("Enter your second double value: ");
        double y = input.nextDouble();
        if(minFunct(x,y) == 0){
            System.out.println("They are the same number");
        }
        else{
            System.out.println("The min double value between among provided integers is " + minFunct(x,y));
           System.out.println("\n \n \n");
            keepRunning = true;
        }
    }
     else if(methodChoice.equals("E"))
    {
        System.out.print("Enter your base value: ");
        int x = input.nextInt();
        System.out.print("Enter your exponent value: ");
        int y = input.nextInt();
        System.out.println(x + " to the power of " + y +" equals " + powFunct(x,y));
        System.out.println("\n \n \n");
        keepRunning = true;
        }
    
     else if(methodChoice.equals("F"))
    {
        System.out.print("Enter your base value: ");
        double x = input.nextDouble();
        System.out.print("Enter your exponent value: ");
        double y = input.nextDouble();
        System.out.println(x + " to the power of " + y +" equals " + DpowFunct(x,y));
        System.out.println("\n \n \n");
        keepRunning = true;
        } 
    
     else if (methodChoice.equals("Z"))
    {
           keepRunning = false;
           System.out.println("Program will now close.");
           break;            
    }
   }while(keepRunning == true);
 }
    public static int maxFunct(int x,int y) // if else statement to return higher int.
    {
        if(x > y)
        {
        return x;
        }
        else if (y > x)
        {
        return y;
        }
        else
        {
        return 0;
        }
    }
    
     public static double maxFunct(double x,double y) // simple if else statement to return higher double.
    {
        if(x > y)
        {
        return x;
        }
        else if (y > x)
        {
        return y;
        }
        else
        {
        return 0;
        }
    }
     public static double minFunct(double x,double y) // simple if else statement to return lower double.
    {
        if(x > y)
        {
        return y;
        }
        else if (y > x)
        {
        return x;
        }
        else
        {
        return 0;
        }
    }
     public static int minFunct(int x,int y) // simple if else statement to return lower int.
    {
        if(x > y)
        {
        return y;
        }
        else if (y > x)
        {
        return x;
        }
        else
        {
        return 0;
        }
    }
     public static int powFunct(int x, int y) //I learned about recursion online. Used it here as it was simpler than using a loop.
     {
        if(y == 0) return 1;
        return x * powFunct(x, --y);
         
     }
     
     public static double DpowFunct(double x, double y) //I learned about recursion online. Used it here as it was simpler than using a loop.
     {
        if(y == 0.0) return 1.0;
        return x * DpowFunct(x, y = y - 1.0);
     }
     
}

    
    
