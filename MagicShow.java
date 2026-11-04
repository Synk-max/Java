
/**
 * The purpose of the program is to create a magic show by guessing the user's number.
 * Milind Tuladhar
 * Oct 22nd
 */

import java.util.Scanner;

public class MagicShow
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Magic Show!");
        System.out.println("Answer a few questions to see a neat magic trick.\n");

        // Get the user's full name as one String
        System.out.print("Please enter your first and last name: ");
        String name = in.nextLine();

        // Get the lower and upper limits as Strings
        System.out.print("Enter the lower limit (three-digit number): ");
        String lowerString = in.nextLine();

        System.out.print("Enter the upper limit (three-digit number): ");
        String upperString = in.nextLine();

        // Parse the Strings into integers
        int lower = Integer.parseInt(lowerString);
        int upper = Integer.parseInt(upperString);

        // Generate a random three-digit number within the range
        int randomNumber = (int)(Math.random() * (upper - lower + 1)) + lower;

        // Repeat the three-digit number to create a six-digit number
        int sixDigitN = randomNumber * 1000 + randomNumber;

        // Display the results using the separate method
        displayResults(name, randomNumber, sixDigitN);
    }

    public static void displayResults(String name, int randomNumber, int sixDigitN)
    {
        // Extract the first initial and last name
        String firstInitial = name.substring(0, 1);
        int space= name.indexOf(" ");
        String lastName = name.substring(space+1);
        
        int step2 = sixDigitN / 7;
        int step3 = step2 / 11;
        int step4 = step3 / 13;

        // Display the results using escape characters
        System.out.println("\n\tWelcome, " + firstInitial + ". " + lastName + "!");
        System.out.println("\tOriginal 3-digit number: " + randomNumber);
        System.out.println("\tRepeated 6-digit number: " + sixDigitN);
        System.out.println("\n\tStep 2: Divide by 7  = " + step2);
        System.out.println("\tStep 3: Divide by 11 = " + step3);
        System.out.println("\tStep 4: Divide by 13 = " + step4);
        System.out.println("\n\tThe original number is " + step4 + "!");
        System.out.println("\n\tHave a great time at the Magic Show!");
    }
}
