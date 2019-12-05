import controller.Pairing;
import modal.DataReader;
import view.DisplayData;
import view.DisplayExchange;
import java.io.FileNotFoundException;

//THIS IS THE ENTRY POINT FOR THE APP
public class CurrencyExchange {
    //MAIN CALLS FOR OTHER CLASSES TO RUN
    public static void main(String[] args) throws FileNotFoundException {

        DataReader csvdata =  new DataReader();//READ THE FOREX.CSV FILE
        csvdata.readCSV();

        DisplayData viewData = new DisplayData();//SHOW DATA
        viewData.viewRawCSV();

        Pairing matchFiat = new Pairing();//PROMPT FOR SYMBOLS
        matchFiat.locateMyFiat();

        DisplayExchange results = new DisplayExchange();
        results.result();
    }
}