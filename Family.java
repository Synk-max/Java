
/**
 * This purpose of the program is to read data from familymembers.txt to check the percentage composition of each data set
 *
 * Milind Tuladhar
 * Nov 8
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String args[])throws IOException
    {
        //assign empty value
        String token="";
        File fileName=new File("familymembers.txt");
        Scanner inFile = new Scanner(fileName);
        int c=0;
        int n=0;
        int n1=0,n2=0;
        //loop until the file has data
        while(inFile.hasNext())
        {
            token=inFile.next();
            if(token.equals("BB")){
                n++;                //count for numberOfBoysOnly set
            }
            else if(token.equals("GG")){
                n1++;               //count for numberOfGirlsOnly set
            }
            else if(token.equals("GB") || token.equals("BG")){
                n2++;               //count for BG or GB set
            }
            c++;
            
        }
        
        double numberOfBoysOnly =((double)n/c)*100;
        numberOfBoysOnly=(int)(numberOfBoysOnly*10)/10.0;
        
        double numberOfGirlsOnly =((double)n1/c)*100;
        numberOfGirlsOnly=(int)(numberOfGirlsOnly*10)/10.0;
        
        double numberOfBoysOrGirls=((double)n2/c)*100;
        numberOfBoysOrGirls=(int)(numberOfBoysOrGirls*10)/10.0;
        
        System.out.println("Composition statistics for families with two children.");
        System.out.println(" ");

        System.out.println("Total number of families: " + c);
        System.out.println(" ");

        System.out.println("Number of families with:");

        System.out.println("2 boys: " + n +" represents "+ numberOfBoysOnly + "%");
        
        System.out.println("2 girls: " + n1 +" represents "+ numberOfGirlsOnly + "%");

        System.out.println("1 boy and 1 girl: " + n2 + " represents "+ numberOfBoysOrGirls+ "%");
        

        inFile.close();             //close file
        
    }//end of main method
}// end of family class