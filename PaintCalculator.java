/**
 * This program calculates the number of gallons of paint you need to paint a square room.
 *
 * @author APCSA Team
 * @version2025
 */

import java.util.Scanner;
public class PaintCalculator
{
    //1. Add a parameter for the user's name. Be sure to include its data type.
    public static void greeting(String userName)
    {
        //2. Output a greeting using the user's name.
        System.out.println("Greetings!" + userName);
        
    }
    
    // 3. Add parameters for the length and height of one of the room's walls. Be sure to include the data type.
    public static int calcRoomArea(int userLength, int userHeight)
    {
        //4. Declare an integer variable named roomArea and calculate the square footage of the room. Assume the room is square. 
        
        int roomArea = 4*userHeight*userLength;
        
        //The return statement has been added for you.
        return roomArea;
    }
    
    //5. Add the parameters for the room's area and the square feet per gallon of paint. Be sure to include the data type.
    public static double CalcPaint(int paintSqft, int userArea)
    {
        //6. Declare a double variable named numGallons and calculate the number of gallons of paint you will need to paint the room. 
        //Remember to use casting.
        double numberOfGallons = (double)userArea/paintSqft;
        
        //7. Return the variable.
        return numberOfGallons;
    }
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String userName;
        int userLength;
        int userHeight;
        int userArea;
        int paintSqft;
        double numberOfGallons;
        
        System.out.print("Please enter your name: ");
        userName = in.nextLine();
        // 8. Call the method to output the greeting to the user using the name they input.
        greeting(userName);
        
        System.out.print("Please enter the length of one wall: ");
        userLength = in.nextInt();
        System.out.print("Please enter the height of one wall: ");
        userHeight = in.nextInt();
        
        //9. Call the method that calculates the room's area and assign it to the variable userArea. Use the length and height from the user input.
        userArea = calcRoomArea(userLength,userHeight);
        
        System.out.println("Your room's area is: " + userArea + " square feet");
        
        System.out.print("How many square feet does a gallon of your paint cover? ");
        paintSqft = in.nextInt();
        
        
        //10. Call the method that calculates the number of gallons of paint you will need to paint the room and assign it to the variable numberOfGallons.
        //Use the calculated area from the previous method and the user input.
        numberOfGallons = CalcPaint(paintSqft,userArea);        
       
        System.out.println("You need " + numberOfGallons + " gallons of paint to paint your room.");              
    }
}