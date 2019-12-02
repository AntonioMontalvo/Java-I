package controller;

import java.io.FileNotFoundException;

public class MathCalculations implements Conversion {

    double valueFiatInDollars = 0;
    double exchangeTotal= 0;

    @Override
    public double myFiatToDollars(double myFiat, double valToExchange) {
        valueFiatInDollars = myFiat * valToExchange;
        return valueFiatInDollars;
    }

    @Override
    public double dollarsToFinalFiat(double wantedFiatValue) {
        this.exchangeTotal = valueFiatInDollars * wantedFiatValue;
        return exchangeTotal;
    }
}
