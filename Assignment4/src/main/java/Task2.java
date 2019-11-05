import java.util.*;

/*
* Assignment 4
* Description: For Loop
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/
/**
 *
 * This program asks for number of subjects &
 * then takes GPA information from the user while above 0.00 and outputs a CGPA.
 */       


public class Task2 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in); //new scanner object
       double GPA = 0.0; //Initializing variables
       double average;
       double totGPA = GPA;
       System.out.print("Please provide the number of subjects: "); //user set subject numbers
       int subjNum = input.nextInt();
       
       for (int i = 1;i < subjNum + 1;i++ ) //for loop sets input to GPA then adds to running total GPA
       {
           System.out.print("Enter the GPA of your subject " + i + ": ");
           GPA = input.nextDouble();
           totGPA = totGPA + GPA; // adds to running total
       }
       average = totGPA / subjNum; // calculates average
       System.out.print("The CPGA of your " + subjNum + " subjects is " + String.format("%.2f", average));
    }
}