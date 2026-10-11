
/**
 * Write a description of class OnlinePurchase here.
 *
 * Milind Tuladhar
 * October 9th
 */
import java.util.Scanner;

public class OnlinePurchase
{   
    public static String Name(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter first name");
        String fname = in.next();
        
        System.out.println("Enter Last name");
        String lname = in.nextLine();
        
        return "Name: "+ fname +lname;
        
        
    }
    
    public static String Date()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter date in mm/dd/yyyy format:");
        String date = in.nextLine();
        
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6,10);
        
        return month + "-"+ day + "-" + year;
    }
    
    public static String Item(String Item_name, String q, String price)
    {
       Scanner to = new Scanner(System.in);
       System.out.println("Item Details \n Item name:");
       Item_name = to.next();
       
       System.out.println("Quantity:");
       q = to.nextLine();
       
       System.out.println("Price:");
       price = to.nextLine();
       
       
    }
    
    public static int Credentials(int c_id , int pin)
    {
         Scanner in = new Scanner(System.in);
         System.out.println("Bank credentials:");
         System.out.println("Please enter Credit Card Number");
         c_id = in.nextInt();
         
         System.out.println("Please enter PIN");
         pin = in.nextInt();
         return 
    }
    
    
    public static void main(String[] args)
    {
        
        
    }
}