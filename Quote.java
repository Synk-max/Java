
/**
 * The purpose of my program is to calculate an estimated pet-sitting service quote based on the customer's pet type
 *
 *Milind Tuladhar
 * Oct 25th
 */

import java.util.Scanner;

public class Quote
{
    static Scanner in = new Scanner(System.in);

    //Get the customer's name
    public static String customerName()
    {
        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        return name;
    }

    //Get the pet's name
    public static String petName()
    {
        System.out.print("Please enter your pet's name: ");
        String pname = in.nextLine();

        return pname;
    }

    //Display pet menu and get selection
    public static String petType()
    {
        System.out.println("\nSelect your pet type:");
        System.out.println("[A] Bird");
        System.out.println("[B] Cat");
        System.out.println("[C] Dog");
        System.out.println("[D] Fish");
        System.out.println("[E] Reptile");
        System.out.println("[F] Small Animal");

        System.out.print("Enter your choice: ");
        String choice = in.nextLine();

        return choice;

    }
    //Calculate daily cost using logical operators
    public static double calculateCost(String type, int visits)
    {
        double cost = 0.0;

        if (type.equalsIgnoreCase("A") && visits == 1)
        {
            cost = 7.0;
        }
        else if (type.equalsIgnoreCase("A") && visits == 2)
        {
            cost = 12.0;
        }
        else if (type.equalsIgnoreCase("B") && visits == 1)
        {
            cost = 10.0;
        }
        else if (type.equalsIgnoreCase("B") && visits == 2)
        {
            cost = 15.0;
        }
        else if (type.equalsIgnoreCase("C") && visits == 1)
        {
            cost = 15.0;
        }
        else if (type.equalsIgnoreCase("C") && visits == 2)
        {
            cost = 20.0;
        }
        else if (type.equalsIgnoreCase("D") && visits == 1)
        {
            cost = 5.0;
        }
        else if (type.equalsIgnoreCase("D") && visits == 2)
        {
            cost = 7.0;
        }
        else if (type.equalsIgnoreCase("E") && visits == 1)
        {
            cost = 9.0;
        }
        else if (type.equalsIgnoreCase("E") && visits == 2)
        {
            cost = 15.0;
        }
        else if (type.equalsIgnoreCase("F") && visits == 1)
        {
            cost = 12.0;
        }
        else if (type.equalsIgnoreCase("F") && visits == 2)
        {
            cost = 17.0;
        }
        else{
            System.out.println("\nIncorrect Choice, Please select again");
            type=petType();
            return calculateCost(type,visits);
        }

        return cost;
    }

    // Display Pet sitting service quote  
    public static void displayQuote(String name, String pet,
    int days, int visits, double total)
    {
        System.out.println("\n================================");
        System.out.println("     Quote for Pet Sitting      ");
        System.out.println("================================");
        System.out.println("Customer Name: " + name);
        System.out.println("Pet Name: " + pet);
        System.out.println("Number of Days: " + days);
        System.out.println("Visits per Day: " + visits);
        System.out.println("Estimated Total: $" + total);
        System.out.println("================================");
    }
    
    //main used for calculation and checking conditions that might not be valid
    public static void main(String[] args)
    {
        String name = customerName();
        String pet = petName();

        System.out.print("How many days will you need pet sitting? ");
        int days = Integer.parseInt(in.nextLine());

        System.out.print("How many visits per day (1 or 2)? ");
        int visits = Integer.parseInt(in.nextLine());
        
    
        String type = petType();
        boolean valid=true;
        if(valid!=(type.equalsIgnoreCase("A") || type.equalsIgnoreCase("B") ||type.equalsIgnoreCase("C") ||type.equalsIgnoreCase("D") || type.equalsIgnoreCase("E") ||type.equalsIgnoreCase("F"))){

            System.out.println("Invalid input, please select a pet type from A to F.");
        }
        else if(visits!=1 && visits!=2 || days<=0){
                System.out.println("Invalid input, please select 1 or 2 visits per day");     
            }
        else{
            double cost = calculateCost(type, visits);
            double total = cost * days;

            displayQuote(name, pet, days, visits, total); 
            }
        
           
        }
}
        

