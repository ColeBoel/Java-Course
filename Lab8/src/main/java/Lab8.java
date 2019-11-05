import java.util.*;

/*
* Lab 8
* Description: 2D Arrays
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/

/** 
 *  This program takes user input to create rows and columns of random numbers, then adds them up.
 * 
 */      
public class Lab8 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the # of rows: ");
        int row = input.nextInt();
        System.out.println("Please enter the # of columns: ");
        int col = input.nextInt();
        int [][] twoDarr = new int[row][col];     
        arr(twoDarr);
        
    }

    public static void arr(int[][] arr){
            
        for(int row = 0; row < arr.length; row++)
        {
         for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = (int)(Math.random() * 100);
                System.out.print(arr[row][col] + " " );
        }
        System.out.println();
        }
        
        
       // sum(twoDarr);
        for(int row = 0; row < arr.length; row++){
        int sum = 0;
         for(int col = 0; col < arr[row].length; col++){
               sum += arr[row][col];
        }
        System.out.println("Sum of row " + row + " is: " + sum);
        }
        
        
    }
        
}
