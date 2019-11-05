import java.util.*;
//import java.io.*;
/*
* Lab 9
* Description: 2D Array Swap
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/
/**
 *
 * This program swaps rows in an array.
 */      
public class Lab9 {
    public static void main(String args[]){
      
        Lab9 objA = new Lab9();
      
        
       System.out.println("The original array is: ");
       
        int [][] array = { //array init
            {10,5,0,10},
            {23,33,5,8},
            {9,34,4,32},
            {73,67,43,8}
            };
        
        
        for(int row = 0; row <array.length;row++){ //array init print
            for(int col = 0; col<array[row].length;col++)
            {
                System.out.print(array[row][col] + " ");
                
            }
            System.out.println("");
        }
        
        Scanner input = new Scanner(System.in);
     
       System.out.println("Enter the 2 rows you want to swap: "); //taking user input for array swap
        int rowA = input.nextInt();
        int rowB = input.nextInt();
        while(rowA != 100){
       if(rowA < 0 || rowA > 3 && rowB < 0 || rowB > 3)
       {
        System.out.println("Entered rows are not within parameters. Please input new ones."); //asks for new rows if not within parameters
        rowA = input.nextInt();
        rowB = input.nextInt();
       }
       else{
           objA.rowSwap(array,rowA,rowB); //doesnt run if within parameters
           rowA = 100;
           
    }
    }
    }
    
   public void rowSwap(int array[][], int rowA, int rowB) //rowswap method
   {
       
       int tempRow[] = array[rowA];
       array[rowA] = array[rowB];
       array[rowB] = tempRow;
       
       
       System.out.println("This is the new array:");
       
       for(int row = 0; row <array.length;row++){
            for(int col = 0; col<array[row].length;col++)
            {
                System.out.print(array[row][col] + " ");
                
            }
            System.out.println("");
        }
       
       
   }
        
        
        
    }

