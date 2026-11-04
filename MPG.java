
/**
 * This program calculates a vehicle's miles per gallon, by requesting user's 
 * number of miles driven and number of gallons spent
 * Oct 16th
 * Milind Tuladhar
 */

import java.util.Scanner;

public class MPG
{
    static Scanner in = new Scanner(System.in);

    //To Ask the user for a trip name and return it as a String.
    public static String trip()
    {
        System.out.print("Please enter a name for your trip: ");
        String name = in.nextLine();

        return name;
    }

    //To Calculate miles per gallon based on the selected vehicle type.
    public static double Calculation(int vehicle, double n_miles, double n_gas)
    {
        double mpg;

        // Electric vehicles do not use any gasoline, so MPG is set to 0.0.
        if(vehicle == 2)
        {
            mpg = 0.0;
        }
        else
        {
            // Divide total miles driven by gallons of gasoline consumed.
            mpg = n_miles / n_gas;
        }

        return mpg;
    }
    public static String vehicleName(int vehicle){
        String type;
        if(vehicle==0)
        {
            type="Traditional";
        }
        else if (vehicle==1)
        {
            type="Hybrid";
        }
        else
        {
            type="Electric";
        }
        return type;
    }
    //To Determine the vehicle's efficiency category using MPG and vehicle type.
    public static String Efficiency(double mpg, int vehicle)
    {
        String eff;

        
        if(vehicle == 2)
        {
            eff = "Electric Efficiency";
        }
        else if(mpg < 15)
        {
            eff = "Poor";
        }
        else if(mpg <= 20)
        {
            eff = "Fair";
        }
        else if(mpg <= 30)
        {
            eff = "Average";
        }
        else if(mpg <= 40)
        {
            if(vehicle==1)
            {
                eff="Hybrid Efficiency";
            }
            else
            {
                eff="Good";
            }
           
        }
        else
        {
            eff = "Excellent";
        }

        return eff;
    }

    
    public static void main(String[] args)
    {
        // Welcome the user and briefly explain the program.
        System.out.println("========================================");
        System.out.println("     Trip Summary");
        System.out.println("========================================");
        System.out.println("This program will help you calculate the");
        System.out.println("fuel efficiency of your trip.");
        System.out.println("Please provide the following information.");
        System.out.println();

        // Collect the trip name before numeric inputs.
        String tripName = trip();

        // Ask the user for the total distance traveled.
        System.out.print("Please enter the total miles driven: ");
        double n_miles = in.nextDouble();

        // Ask the user for the amount of gasoline consumed.
        System.out.print("Please enter the gallons of gasoline used: ");
        double n_gas = in.nextDouble();

        // Allow the user to select the appropriate vehicle category.
        System.out.println();
        System.out.println("Please select your vehicle type:");
        System.out.println("0 - Traditional Vehicle");
        System.out.println("1 - Hybrid Vehicle");
        System.out.println("2 - Electric Vehicle");
        System.out.print("Enter your selection (0, 1, or 2): ");
        int vehicle = in.nextInt();
        
        String type=vehicleName(vehicle);
        // Call the Calculation method to determine MPG.
        double mpg = Calculation(vehicle, n_miles, n_gas);

        // Call the Efficiency method to determine the efficiency category.
        String eff = Efficiency(mpg, vehicle);

        // Display a summary of the user's trip and calculated results.
        System.out.println();
        System.out.println("========================================");
        System.out.println("              Trip Summary");
        System.out.println("========================================");
        System.out.println("Trip Name: " + tripName);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Miles Driven:" + n_miles);
        System.out.println("Gallons of gas used:" + n_gas);
        System.out.println("Trip MPG: " + ((int)(mpg*10)/10.0));
        System.out.println("Your trip's Fuel Efficiency: " + eff);
        System.out.println("========================================");
        
    }
}
