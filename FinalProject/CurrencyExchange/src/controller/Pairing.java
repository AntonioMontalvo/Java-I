package controller;

import modal.DataReader;
import view.PromptUser;

import java.io.FileNotFoundException;

public class Pairing {
    DataReader data = new DataReader();
    String [][] matrix  = data.readCSV();

    MathCalculations mathResults = new MathCalculations();


    //CURRENCY TO EXCHANGE//
    String myFiatSymbol = "EUR";
    String mySymbolMeaning = "";
    double myFiatValue = 0.0;
    double valueToExchange = 0.0;

    //CURRENCY TO BUY//
    String myWantedSymbol = "GBP";
    String myWantedSymbolMeaning = "";
    double wantedFiatValue = 0;


    public Pairing() throws FileNotFoundException { }

    public void locateMyFiat() throws FileNotFoundException {
        //FIRST ASK USER FOR INPUT
        PromptUser userInput = new PromptUser();
       this.myFiatSymbol = userInput.askFiatToExchange();
       this.myWantedSymbol = userInput.askWantedFiat();
       this.valueToExchange = userInput.askAmount();

       //ONCE WE'VE VERIFIED INPUT FIND AND SHOW REQUEST
        for (int i = 0; i < 167; i++) {
            if (matrix[i][0].contains(myFiatSymbol)) {
                myFiatValue = Double.parseDouble(matrix[i][2]);
                mySymbolMeaning = matrix[i][1];
            }
            if (matrix[i][0].contains(myWantedSymbol)) {
                wantedFiatValue = Double.parseDouble(matrix[i][2]);
                myWantedSymbolMeaning= matrix[i][1];
            }
        }

        System.out.println("The current rate for the " + mySymbolMeaning + " is " + myFiatValue + " per US dollar");
        System.out.println("The current rate for the " + myWantedSymbolMeaning + " is " + wantedFiatValue + " per US dollar");
        System.out.println("The amount you want to exchange is: " + valueToExchange + " " + mySymbolMeaning);
        System.out.println("");
        System.out.println("//// The Results/////");
        System.out.println("This is the amount of dollars you get for your currency " + mathResults.myFiatToDollars(myFiatValue, valueToExchange ));
     
        System.out.println("The total amount of is " + mathResults.dollarsToFinalFiat(wantedFiatValue));



    }
}
