package view;

import modal.DataReader;

import java.io.FileNotFoundException;

public class DisplayData {
    public void viewRawCSV() throws FileNotFoundException {
        System.out.println("****THIS IS DISPLAY DATA****");
        DataReader rawData = new DataReader();
        for (int i = 0; i < 167; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(rawData.readCSV()[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
