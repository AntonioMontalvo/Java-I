package controller;


import modal.DataReader;

import java.io.FileNotFoundException;

public class CaptureInput {


    public boolean verify3Symbol(String symbol) {
        return symbol.length() != 3 || !symbol.matches("^[a-zA-Z]*$");
    }

    public boolean verifyAmount(String amount) {
        try {
            Double checkIfImDouble = Double.parseDouble(amount);
            if(!checkIfImDouble.isNaN()){
                return true;
            }
        }catch (NumberFormatException e){
            System.out.println("not a double");
        }
        return false;
    }
}

