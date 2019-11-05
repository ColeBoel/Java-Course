import java.util.*;

/*
* Assignment 4
* Description: Do-While Loop
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/
/**
 *
 * This program takes GPA information from the user while above 0.00 and outputs a CGPA.
 */       


public class Task1 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in); //new scanner object
       double GPA = 0.0; //initializing variables
       double average;
       int var1 = 0;
       double totGPA = GPA;
       do //do while loop. after doing both of these the for loop was much more straightforward
       {
        var1++; // bringing var1 from 0 to 1, then adding to it each iteration.
        System.out.print("Enter GPA of your subject " + var1 + ": " );
        GPA = input.nextDouble();
        totGPA = totGPA + GPA; //setting a running total
       } while (GPA >= 1.0 && GPA <= 4.0);
       var1 = var1 - 1; 
       average = totGPA / var1; //calculating average
       System.out.print("The CPGA of your " + var1 + " subjects is " + String.format("%.2f", average)); //setting limit to decimal places
    }
}