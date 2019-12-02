package view;

import controller.CaptureInput;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PromptUser{

    private String myFiatSymbol = "";
    private double myFiatAmount;
    private  String amountToCheck = "";
    private String myWantedSymbol = "";

    Scanner userInput = new Scanner(System.in);  // Create a Scanner object
    CaptureInput testing = new CaptureInput();

    public String  askFiatToExchange() throws FileNotFoundException {
        do {
            System.out.println( "Introduce the symbol for the type of fiat currency you want to EXCHANGE. \n" +
                    "For your convenience list of symbols is provided above");
            myFiatSymbol = userInput.nextLine().toUpperCase();
            if(testing.verify3Symbol(myFiatSymbol)){
                System.out.println("Please remember, the symbol is 3 alphabetical characters only!");
            }

        } while(testing.verify3Symbol(myFiatSymbol));
          // Read user input to uppercase
        System.out.println("my Fiat Symbol is :" + myFiatSymbol);
        return myFiatSymbol;
    }

    public String askWantedFiat(){
        do {
            System.out.println( "Introduce a second symbol for the currency you  want to GET");
            myWantedSymbol = userInput.nextLine().toUpperCase();
            if(testing.verify3Symbol(myWantedSymbol)){
                System.out.println("Please remember, the symbol is 3 alphabetical characters only!");
            }
        } while(testing.verify3Symbol(myWantedSymbol));
        // Read user input to uppercase
        System.out.println("my Wanted Symbol is :" + myWantedSymbol);
        return myWantedSymbol;
    }

    public double askAmount(){
        do{
            System.out.println("Introduce the AMOUNT want to exchange. Type a double.");
            amountToCheck = userInput.nextLine().toLowerCase();
            if(testing.verifyAmount(amountToCheck)){
                System.out.println("Are you trying to trick me? That is not a double.");
                myFiatAmount = Double.parseDouble(amountToCheck);
            }
        }while (!testing.verifyAmount(amountToCheck));
        return myFiatAmount;
    }

}
