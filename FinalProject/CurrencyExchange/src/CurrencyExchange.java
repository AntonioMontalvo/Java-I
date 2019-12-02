import controller.Pairing;
import modal.DataReader;
import view.DisplayData;
import view.DisplayExchange;


import java.io.FileNotFoundException;

public class CurrencyExchange {

    public static void main(String[] args) throws FileNotFoundException {

        DataReader csvdata =  new DataReader();
        csvdata.readCSV();

        DisplayData viewData = new DisplayData();
        viewData.viewRawCSV();

        Pairing matchFiat = new Pairing();
        matchFiat.locateMyFiat();

        DisplayExchange results = new DisplayExchange();
        results.result();

    }
}