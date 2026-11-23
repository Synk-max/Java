
/**
 * The purpose of the program is to simulate the rolling of a 6 or higher faced dice
 *
 * Milind Tuladhar
 * Nov 4th
 */
import java.util.Scanner;
public class Dice2
{   
    //a scanner object for reusability
    static Scanner in = new Scanner(System.in);
    
    public static int inValid(int sides){
        
        //to check if the side of the dice is within range
        while(sides<6 || sides>20){
            System.out.println(sides + " is not a valid entry.");
            System.out.print("Please enter a valid number of sides for your dice: ");
            sides=in.nextInt();
        }
        return sides;       //returns the corrected version
    }
    public static void main(String[] args){
        System.out.print("Enter the number of sides on your dice: ");
        int sides=in.nextInt();
        int total=0;
        sides = inValid(sides); 
        System.out.println(" ");
        
        System.out.print("How many rolls would you like? ");
        int rolls=in.nextInt();
        System.out.println(" ");
        
         //this var catches the value returned from function inValid()
        System.out.println("Result for a "+sides+"-sided Dice thrown "+rolls+" times");
        System.out.println("******************************************************");
        int n=1;
        System.out.println("\n");
        while(rolls>=n){
            // Generate a number and add one to make the rolls within the range 
            int result=(int)(Math.random()*sides)+1;
            System.out.println("Roll "+ n +" is "+result);
            n++;
            
            // Add the current roll result to the total.
            total+=result;
        }
        
        System.out.println("The Total of "+rolls+" rolls is " + total);
        
        
    }
}