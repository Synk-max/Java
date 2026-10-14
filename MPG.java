
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
            mpg=0;
        }
        else if(vehicle==2){
            new += "Efficiency";
        }
        else
        {
            mpg= n_miles/n_gas;
        }
        
        return 0;
    }
    
    
    
   public static void main(String[] args){
        
       
       System.out.println("--------Trip Summary--------");
       
       
       
   }
}