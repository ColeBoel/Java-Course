/*
* Lab 3
* Description: Fibonnaci Calculator
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 211-03
* Semester: Fall 2019
*/
/**
 * This program allows you to input a number and get that many digits of the Fibonnaci sequence back.
 * @author joshc
 */

import java.util.*;

public class Fibonnaci {
    public static void main(String[] args){
        int var1 = 0;
        int var2 = 1;
        Scanner input = new Scanner(System.in);
        //initializing my variables
        
        System.out.println("Enter number of terms for Fibonnaci Series:");
        int fibNum = input.nextInt();
        //creating an input variable
        if (fibNum > 20) //checking to see if the number is within parameters
            System.out.println("Please enter a number less than 20.");
        else if (fibNum <=0)
            System.out.println("Please enter a number greater than 0.");
        else //for loop to add numbers and display fibonnaci numbers
            for(int i = 1; i <= fibNum; ++i)
            {
                System.out.print(var1 + " ");
                int sumF = var1 + var2;
                var1 = var2;
                var2 = sumF;
            }
    } //displays Fibonnaci sequence to the amount of digits entered by the user.
}

//