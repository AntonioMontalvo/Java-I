package controller;

import modal.DataReader;

import java.io.FileNotFoundException;

public class CaptureInput { //HERE WE VERIFY THE USERS INPUT

    public boolean verify3Symbol(String symbol) {//THREE LETTERS LONG
        return symbol.length() != 3 || !symbol.matches("^[a-zA-Z]*$");
    }

    public boolean verifySymbolExists(String symbol) throws FileNotFoundException {//SEARCH FOR THE SYMBOL IN OUR MATRIX
        DataReader data = new DataReader();
        String[][] matrix = data.readCSV();

        for (int i = 0; i < 167; i++) {
            if (matrix[i][0].contains(symbol)) {
                return true;
            }
        }

        return false;
    }

    public boolean verifyAmount (String amount) {//CHECK THE AMOUNT IS A DOUBLE
        Double checkIfImDouble = Double.parseDouble(amount);
        try {
            if(Double.isNaN(checkIfImDouble)){
                return false;
            }
        }catch (NumberFormatException e){
                System.out.println("not a double" + e);
        }
        return true;
    }

}

