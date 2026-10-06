/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Milind Tuladhar
 * @version 2026
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;        // starting US Dollars

        double pesosSpent = 7210.25;               // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;        // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;         // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;           // US dollars remaining after Mexico

        double francsSpent = 3408;              // French Francs spent
        double francExchangeRate = 6.55957;        // 1 US dollar = 6.55957 French Francs
        double dollarsSpentInFrance = 0.0;         // US dollars spent in France
        double dollarsAfterFrance = 0.0;           // US dollars remaining after France

        double yenSpent = 84500;                 // Japanese Yen spent
        double yenExchangeRate = 148.50;           // 1 US dollar = 148.50 Yen
        double dollarsSpentInJapan = 0.0;          // US dollars spent in Japan
        double dollarsAfterJapan = 0.0;            // US dollars remaining after Japan

        double reaisSpent = 2000;               // Brazilian Reais spent
        double reaisExchangeRate = 5.35;           // 1 US dollar = 5.35 Reais
        double dollarsSpentInBrazil = 0.0;         // US dollars spent in Brazil
        double dollarsAfterBrazil = 0.0;           // US dollars remaining after Brazil

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Starting US dollars= $" + startingUsDollars);

        
        System.out.println("Expenditure in Countries:");
        // Mexico
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;

        System.out.println("Mexico");
        System.out.println("Pesos spent:         " + pesosSpent);
        System.out.println("US dollarsConversion= $" + dollarsSpentInMexico);
        System.out.println("US dollars remaining= $" + dollarsAfterMexico);
        System.out.println();

        // France
        dollarsSpentInFrance = francsSpent / francExchangeRate;
        dollarsAfterFrance = dollarsAfterMexico - dollarsSpentInFrance;

        System.out.println("France");
        System.out.println("Francs spent:        " + francsSpent);
        System.out.println("US dollarsConversion= $" + dollarsSpentInFrance);
        System.out.println("US dollars remaining= $" + dollarsAfterFrance);
        System.out.println();

        // Japan
        dollarsSpentInJapan = yenSpent / yenExchangeRate;
        dollarsAfterJapan = dollarsAfterFrance - dollarsSpentInJapan;

        System.out.println("Japan");
        System.out.println("Yen spent:           " + yenSpent);
        System.out.println("US dollarsConversion= $" + dollarsSpentInJapan);
        System.out.println("US dollars remaining= $" + dollarsAfterJapan);
        System.out.println();

        // Brazil
        dollarsSpentInBrazil = reaisSpent / reaisExchangeRate;
        dollarsAfterBrazil = dollarsAfterJapan - dollarsSpentInBrazil;

        System.out.println("Brazil");
        System.out.println("Reais spent:         " + reaisSpent);
        System.out.println("US dollarsConversion= $" + dollarsSpentInBrazil);
        System.out.println("US dollars remaining= $" + dollarsAfterBrazil);
        System.out.println();

        // Remaining US dollars
        System.out.println("=================================");
        System.out.println("Remaining Us dollars= $" + dollarsAfterBrazil);

        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 15;                       //cost per item of first souvenir
        int budget1 = 100;                       //budget for first item
                                 

        double totalItems1 = (int)(budget1 / costItem1);       //total items 
        double fundsRemaining1 = budget1 % costItem1;    //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1);
        System.out.println("   Budget: $" + budget1);
        System.out.println("   Total items purchased: " + totalItems1);
        System.out.println("   Funds remaining: $" + fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                //cost per item of second souvenir
        int budget2 = 500;                       //budget for second item
                  

        double totalItems2 = (int)(budget2 / costItem2);    //total items for souvenir #2
        double fundsRemaining2 = budget2 % costItem2;      //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2);
        System.out.println("   Budget: $" + budget2);
        System.out.println("   Total items purchased: " + totalItems2);
        System.out.println("   Funds remaining: $" + fundsRemaining2);

    } // end of main method
} // end of class