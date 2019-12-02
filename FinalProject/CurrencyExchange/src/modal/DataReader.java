package modal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReader {

    //class method creates and returns a two dimensional array
    public String [] [] readCSV() throws FileNotFoundException {
        final int COUNTRIES = 200;
        final int COLUMNS = 3;
        String csvData = "";
        String [] [] matrix = new String [COUNTRIES][COLUMNS]; //matrix for a maximum of 200 countries an three columns
        int row = 0;
        //Scanner reads csv file
        Scanner fileReader = new Scanner(new File("./CurrencyExchange/src/modal/dataFile/forex.csv"));
        //Scanner will read each line while there is one
        while (fileReader.hasNextLine()) {
             csvData = fileReader.nextLine(); //store it as a string
             String[] csvDataArray = csvData.split(",");
            //pass values to two array dimensional
            for (int i = 0; i < csvDataArray.length; i++) {
                matrix [row][i]= csvDataArray[i];
            }
            row++;
        }
        return matrix;
    }

}
