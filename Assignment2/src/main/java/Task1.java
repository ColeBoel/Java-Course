/*
* Assignment 2
* Description: Simple Currency Calculator
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/

/**
 *Today we are creating a program that converts dollars into euros
 * British pounds, and vice versa
 */

import java.util.*;
        
public class Task1 {
    public static void main(String[]args)
    {
        double X = .91;
        double Y = .81;
        int dollars;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hi,Welcome to my currency conversion program. \n" +
"The current rate for 1 dollar to Euro conversion is " + X +".\n" +
"The current rate for 1 dollar to British Pound conversion is " + Y + ".");
        System.out.println( "Please enter your amount in dollars:    ");
        dollars = input.nextInt();
        System.out.println("Result: \n" +
"Today, " + dollars + " dollars are equal to " + dollars * X + " Euros and " + dollars * Y + " British Pounds.");
        
    }
    
}