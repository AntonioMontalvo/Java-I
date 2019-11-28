import controller.CaptureInput;
import controller.MathCalculations;
import controller.Pairing;
import modal.DataReader;
import view.DisplayData;
import view.DisplayExchange;
import view.PromptUser;

import java.io.FileNotFoundException;

public class CurrencyExchange {

    public static void main(String[] args) throws FileNotFoundException {

        DataReader csvdata =  new DataReader();
        csvdata.readCSV();

        DisplayData viewData = new DisplayData();
        viewData.viewRawCSV();

        PromptUser userInput = new PromptUser();
        userInput.fiatToExchange();
        DisplayExchange results = new DisplayExchange();
        results.result();

        CaptureInput newView = new CaptureInput();
        newView.manipulateCSV();

        Pairing matchedFiat = new Pairing();
        matchedFiat.locateTarget();

        MathCalculations mathConversion = new MathCalculations();
        mathConversion.converter();
    }
}