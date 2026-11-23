/**
 * The purpose of the program is to Randomly generate passwords.
 *
 * Milind Tuladhar
 * November 13
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 0; 
        String password = "";

        // initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        
        PrintWriter outFile = new PrintWriter(new File("password.txt"));
         
        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
        
        
        // ask for password length 
        System.out.print("Enter a password length (6 or more): ");
        pwLength = in.nextInt();
        
        
        // the user wants to continue
        while(userChoice.equalsIgnoreCase("Y")){
            while(pwLength<6){
            // validate password length
            System.out.println("Password length too short. Please try again.");
            System.out.print("Enter a password length (6 or more): ");
            pwLength = in.nextInt();
        }
        
        password="";
        // generate a random character in the correct character set
        for(int i=0;i<pwLength;i++)
        {
            randNum = (int)(Math.random()*75) + 48;
            if((randNum>=48 && randNum<=57) || (randNum>=65 && randNum<=90) || (randNum>=97 && randNum<=122))
            {
                // concatenate the character to the password
                String character = "" + (char)randNum;
                password=password+character;
            }
            else
            {
                i--;            //reduces i to keep the values in range
            }
        }
        outFile.println(password);            
        
        
        System.out.print("Would you like to generate another password? Y/N");
        userChoice = in.next();
        if(userChoice.equalsIgnoreCase("Y")){
            System.out.print("Enter a password length (6 or more): ");
            pwLength = in.nextInt();
        }
        
    }
    
    // when the user is done, close the text file so that it can be re-opened and read outFile.close();
    outFile.close();   
        
        // write the password to the file        
        File file = new File("password.txt");
        Scanner fileReader = new Scanner(file);

        System.out.println("Your saved passwords:");
        // read passwords back from text file and display to the screen
        while(fileReader.hasNextLine())
        {
            System.out.println(fileReader.nextLine());
        }
    

    fileReader.close();
        
    
  }//end main
}//end class

