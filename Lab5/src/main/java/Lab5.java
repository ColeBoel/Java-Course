import java.util.*;

/*
* Lab 5
* Description: Pyramid Loop
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/
/**
 *
 * This program takes input from the user and outputs rows of * in a pyramid formation.
 */      

public class Lab5 {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter desired height of the pyramid: ");
    int pyrH = input.nextInt();
    pyramid(pyrH);
    }

    public static void pyramid(int h)
    {
       for(int i = 0; i < h; i++)//creates each row
       {
           for(int j=h-i;j>1;j--)//takes height value and subtracts #rows to output appropriate spaces
           {
               System.out.print(" "); //print space
           }
           for(int j = 0;j<=i;j++)//for each row print * + space after initial spaces
           {
               System.out.print("* ");
           }
           System.out.println(); //ends line
               
       };
    }
}


