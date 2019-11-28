package controller;

import modal.DataReader;

import java.io.FileNotFoundException;

public class Pairing {
    DataReader data = new DataReader();
    String [][] matrix  = data.readCSV();
    String myFiatSymbol = "ZMW";

    public Pairing() throws FileNotFoundException {
        
    }

    public void locateTarget(String myFiatSymbol){
        for (int i = 0; i < ; i++) {

        }


        System.out.println("controller.Pairing is on");
    }
}
