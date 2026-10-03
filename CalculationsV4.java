
/**
 * 
 * Milind Tuladhar
 * 30th September
 * This program calculates and displays mathematical quations by using different 
 * arthimetic operators
 */
public class CalculationsV4
{
    public static void main(String[] args){
        // Declaring integer variables
        int Num1 = 25;
        int Num2 = 9;
        int Num3 = 15;

        // For Addition
        System.out.println("Addition");
        System.out.println(Num1 + " + " + Num2 + " = " + (Num1 + Num2));

        // For Subtraction
        System.out.println("Subtraction");
        System.out.println(Num3 + " - " + Num2 + " - " + Num1 + " = " + (Num3 - Num2 - Num1));

        // For Multiplication
        System.out.println("Multiplication");
        System.out.println(Num1 + " * " + Num2 + " = " + (Num1 * Num2));

        // For Division
        System.out.println("Division");
        System.out.println(Num2 + " / " + Num1 + " = " + (Num2 / Num1));

        // For Modulus
        System.out.println("Modulus");
        System.out.println(Num3 + " % " + Num2 + " = " + (Num3 % Num2));
        
        //CalculationsV4
        System.out.println(Num1 + " + " + Num2 + " * " + Num3 + " = " 
                   + (Num1 + Num2 * Num3));

        System.out.println(Num1 + " - " + Num3 + " / " + Num2 + " = " 
                   + (Num1 - Num3 / Num2));

        System.out.println(Num1 + " % " + Num2 + " + " + Num3 + " * " + Num2 + " = " 
                   + (Num1 % Num2 + Num3 * Num2));

    }
}