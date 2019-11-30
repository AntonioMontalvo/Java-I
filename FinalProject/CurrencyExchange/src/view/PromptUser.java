package view;

import controller.CaptureInput;

import java.util.Scanner;

public class PromptUser{

    private String myFiatSymbol = "";
    private double myFiatAmount = 0.0;
    private String myWantedSymbol = "";

    public void askFiatToExchange(){

        System.out.println("view.PromptUser is on");
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object

        CaptureInput testing = new CaptureInput();

        do {
            System.out.println( "Introduce the symbol for the type of fiat currency you want to exchange. \n" +
                    "For your convenience list of symbols is provided above");
            myFiatSymbol = userInput.nextLine().toUpperCase();
            if(testing.verifySymbol(myFiatSymbol)){
                System.out.println("Please remember, the symbol is 3 alphabetical characters only!");
            }
        } while(testing.verifySymbol(myFiatSymbol));
          // Read user input to uppercase
        System.out.println("myFiatSymbol is :" + myFiatSymbol);
    }


    public void askWantedFiat(){

    }
}
