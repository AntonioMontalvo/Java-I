package controller;

public class CaptureInput {
    public void manipulateCSV() {
        System.out.println("controller.CaptureInput is on");
    }

    public boolean verifySymbol(String symbol){
        return symbol.length() != 3 || !symbol.matches("^[a-zA-Z]*$");
    }
}
