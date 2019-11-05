import java.util.*;

/*
* Lab 4
* Description: Switch Case
* Name: Joshua Cole Boelman
* ID: 920600561
* Class: CSC 210-06
* Semester: Fall 2019
*/
/**
 *
 * This program takes user input on a operator and integers to do math.
 */       

public class Lab4_SwitchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double var1;
        double var2;
        System.out.println("Enter operator (either +, -, *, /, % or ^):");
        String oper1 = input.next();
        System.out.println("Enter number 1 and number 2 respectively:");
        var1 = input.nextInt();
        var2 = input.nextInt();
        //declaring variables needed
        double add = var1 + var2;
        double sub = var1 - var2;
        double mult = var1 * var2;
        double div = var1 / var2;
        double rem = var1 % var2;
        double expo = Math.pow(var1,var2);
        //setting up operations to send to switch
       
        {
        switch(oper1)
        {
            case "+": 
                System.out.println(var1 + oper1 + var2 + "=" + add );
                break;
            case "-": 
                System.out.println(var1 + oper1 + var2 + "=" + sub );
                break;
            case "*": 
                System.out.println(var1 + oper1 + var2 + "=" + mult );
                break;
            case "/": 
                System.out.println(var1 + oper1 + var2 + "=" + div );
                break;
            case "%": 
                System.out.println(var1 + oper1 + var2 + "=" + rem );
                break;
            case "^": 
                System.out.println(var1 + oper1 + var2 + "=" + expo );
                break;
            default:
                System.out.println("Please enter one of the available operators.");
                
        }// switch to do math
        }
        
        
                
            
            
            
        }
}
