/**
 * This program reads purchase details from the user as input and prints a receipt of the user
 *
 * Milind Tuladhar
 * October 9th
 */
import java.util.Scanner;

public class OnlinePurchase
{   
    static Scanner in = new Scanner(System.in);
    public static String Name(){
         
        
        System.out.print("Please enter your first and last name: ");
        String name = in.nextLine();
                
        return name;

    }
    
    public static String Date()
    {
         
        System.out.print("Please enter today's date (mm/dd/yyyy): ");
        String date = in.nextLine();
        
        String month = date.substring(0,2);    
        String day = date.substring(3,5);    
        String year = date.substring(6,10);
        
        return month + "-"+ day + "-" + year;
    }
    
    public static String Item()
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Item Details \n Please enter the name of the item you wish to purchase: ");
       String itemName = in.nextLine();
       
       System.out.print("Please enter the quantity of the item: ");
       String quantity = in.nextLine();
       int q = Integer.parseInt(quantity);      //converting quantity from astring to a integer
       
       System.out.print("Please enter the price per item: ");
       String price = in.nextLine();
       
       double p = Double.parseDouble(price);        //change price from string to double 
       
       double totalCost = q*p;            //calculate the cost for total number of items
       return itemName +" \t\t" + q +"\t\t"+p +"\t"+totalCost;

    }
    
    public static String Order(String name,String c4){
        int length = name.length();
        String orderId = name.substring(length-2)+c4;  //add the last two characters from name and add last 4 numbers from card
         
        return orderId;
    }
    
    public static String Credentials()
    {
         Scanner in = new Scanner(System.in);
         System.out.print("Please enter your debit card account number: ");
         
         String cId = in.nextLine();
         
         String c4= cId.substring(cId.length() -4);       //to extract the last four digits of the card

         System.out.print("Please enter your debit card PIN: ");
         String pin = in.nextLine();
         return c4;
    }
    
    
    public static void main(String[] args)
    {   
        // calling all the functions from above necessary for the receipt
        String User=Name();
        String date = Date();
        String Item = Item();
        String cardLastFour = Credentials();
        String orderNumber = Order(User,cardLastFour);   //Parameters to pass onto Order function once Name() and Credentials() return a value
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
         System.out.println("Your e-Receipt");
        System.out.println();
        System.out.println(date);
        System.out.println("\nOrder number:");
        System.out.println(orderNumber);
         System.out.println();
        System.out.println("Customer:");
        System.out.println(User.substring(0,1));
        System.out.println("\n Item Name\t"+"Quantity\t"+"Price\t"+"Total");
        System.out.println(Item);
        System.out.println();
        System.out.print("Last four digits of debit card:");
        System.out.println(cardLastFour);
        System.out.println("  Thank you. Enjoy your purchase.");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
    }
}