package controller;

import modal.DataReader;
import view.PromptUser;

import java.io.FileNotFoundException;

public class Pairing {
    DataReader data = new DataReader();
    String [][] matrix  = data.readCSV();

    //->get symbols from PromptUser

    //CURRENCY TO EXCHANGE//
    String myFiatSymbol = "EUR";
    String mySymbolMeaning = "";
    double myFiatValue = 0;

    //CURRENCY TO EXCHANGE//
    String myWantedSymbol = "GBP";
    String myWantedSymbolMeaning = "";
    double wantedFiatValue = 0;




    public Pairing() throws FileNotFoundException {

    }

    public void locateMyFiat() throws FileNotFoundException {
        PromptUser userInput = new PromptUser();
       this.myFiatSymbol = userInput.askFiatToExchange();
       this.myWantedSymbol = userInput.askWantedFiat();
       this.myFiatValue = userInput.askAmount();

        for (int i = 0; i < 167; i++) {
            if (matrix[i][0].contains(myFiatSymbol)) {
                myFiatValue = Double.parseDouble(matrix[i][2]);
                mySymbolMeaning = matrix[i][1];
            }
            if (matrix[i][0].contains(myWantedSymbol)) {
                wantedFiatValue = Double.parseDouble(matrix[i][2]);
                myWantedSymbolMeaning= matrix[i][1];
            }


            System.out.println("controller.Pairing is on");
        }
        System.out.println("The current rate for the " + mySymbolMeaning + " is " + myFiatValue + " per US dollar");
        System.out.println("The current rate for the " + myWantedSymbolMeaning + " is " + wantedFiatValue + " per US dollar");
        System.out.println("The amount you want to exchange is: " + myFiatValue);
    }



}
