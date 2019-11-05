/*
* Assignment 2
* Description: Temperature Converter
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/

/**
 *This program simply converts Celsius to Fahrenheit
 */

import java.util.*;
        
public class Task2 {
    public static void main(String[]args)
    {
        double Celsius;
        Scanner input = new Scanner(System.in);
     
        System.out.println( "Enter the current temperature in Celsius:    ");
        Celsius = input.nextInt();
        double fahrenheitConvert = Celsius * 9 / 5 + 32;
        System.out.println( Celsius + " Celsius is equal to " + fahrenheitConvert + " Fahrenheit.");
    }
    
}