
/**
 * Write a description of class MPG here.
 *
 * Milind Tuladhar
 */
import java.util.Scanner;
public class MPG
{
    static Scanner in = new Scanner(System.in);
    public static String trip(){
        System.out.println("Enter the trip name:");
        String name = in.nextLine();
        return name;
    }
    //a function to calculate mpg and return efficiency
    public static double Calculation()
    {
        System.out.print("Enter the number of miles driven");
        double n_miles = in.nextDouble();
        
        System.out.print("Enter the number of gasoline used");
        double n_gas = in.nextDouble();
        
        System.out.print("Enter the type of vehicle (0 = Traditional, 1 = Hybrid, 2 = Electric): )");
        int vehicle = in.nextInt();
        double mpg;
    
        if(vehicle==3){
            mpg=0.0;
        }
        else{
            mpg= n_miles/n_gas;
        }
        
        return mpg;
    }
    
    public static String Efficiency(double mpg, String eff)
    {
        if(mpg <15){
            eff = "Poor";
        }
        else if(mpg>15 && mpg<=20){
            eff = "Fair";
        }
        else if(mpg>20 && mpg<=30){
            eff = "Average";
        }
        else if(mpg>30 && mpg<=40){
            eff = "Good";
        }
        else
            eff ="Excellent";
        
        
        return eff;
    }
    
    
   public static void main(String[] args){
       String tripName = trip();
       double mpg = Calculation();

        String eff = Efficiency(mpg, "");

        System.out.println("--------Trip Summary--------");
        System.out.println("Trip Name: " + tripName);
        System.out.println("Miles Per Gallon: " + mpg);
        System.out.println("Fuel Efficiency: " + eff);
    }
       
       
}