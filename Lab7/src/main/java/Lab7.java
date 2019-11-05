import java.util.*;
import java.io.*;
/*
* Lab 7
* Description: Arrays
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/
/**
 *
 * This program takes a string from the user and inputs it into two arrays to compare them.
 */      
public class Lab7 {
    public static void main(String args[]) // main class initializing variables and arrays
            
    {
        Scanner input = new Scanner(System.in); // scanner init
        
        
        String[] arr1 = new String[5]; // array init
        String[] arr2 = new String[5]; // array init
        
        System.out.println("Please enter 5 values in array 1"); // long form for array input
        
        for(int i = 0; i < arr1.length ; i++)
        {
            arr1[i] = input.nextLine();
        }
        System.out.println("       ");
        System.out.println("Please enter 5 values in array 2"); //long form for array input
        
        for(int k = 0; k < arr2.length ; k++)
        {
            arr2[k] = input.nextLine();
        }
        
        
      method_compare(arr1,arr2); //calling method for comparing the arrays
      
    }

    public static void method_compare(String[] arr1, String[] arr2) // method to compare arrays
    {
        boolean equal = false; //bool to checck if theyre equal 
        for(int i = 0; i < arr1.length; i++)
            for(int j = 0; j < arr2.length; j++)
            {
                if(arr1[i].equals(arr2[j]))
                {
                    equal = true;
                    System.out.println(arr1[i] + " occurs in both array 1 and array 2");
                }
                
            }
        if(equal == false)
            {
    System.out.println("There are no common elements in the array.");
            }
    }
            
    }
