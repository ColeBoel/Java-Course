import java.util.*;
import java.lang.String;
/*
* Lab 6
* Description: Overloaded Methods
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/
/**
 *
 * This program takes a string from the user and outputs the amount of words in the string.
 */      
public class Lab6 {
    public static void main(String args[])
    {
      System.out.println("Please enter a string");
      
      String sentence;
      int words = 0;
      
      Scanner input = new Scanner(System.in);
      sentence = input.nextLine();
      
      method_string();
      
      Lab6 methodOne = new Lab6();
      words = methodOne.method_string(sentence);
      
      System.out.println("There are " + words + " words in your input");
      
       
    }
    
    public static void method_string()
    {
        System.out.println("Thank you for your input");
    };
    
    public int method_string(String input1)
    {
        if(input1 == null || input1.isEmpty()){ // if there are no words do nothing.
            return 0;
        }
        else{
        String[] var1 = input1.split("\\s+"); // if there are words then count the number of spaces between the words in the string.
        return var1.length;
        }
    };
    
    
}
