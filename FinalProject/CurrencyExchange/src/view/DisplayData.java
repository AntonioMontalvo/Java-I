package view;

import modal.DataReader;

import java.io.FileNotFoundException;

public class DisplayData {
    public void viewRawCSV() throws FileNotFoundException {
        DataReader rawData = new DataReader();
        for (int i = 0; i < 167; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(rawData.readCSV()[i][j] + " ");
            }
            System.out.println(" ");
        }
//        System.out.println("This is 0 2 "+rawData.readCSV()[2][2]);
    }
}
