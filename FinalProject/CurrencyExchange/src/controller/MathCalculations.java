package controller;

public class MathCalculations implements Conversion {//THIS CLASS IMPLEMENTS THE CONVERSION INTERFACE

    double valueFiatInDollars = 0;
    double exchangeTotal= 0;

    @Override
    public double myFiatToDollars(double myFiat, double valToExchange) {//CONVERT THE AMOUNT OF YOU WANT TO EXCHANGE TO DOLLARS
        valueFiatInDollars = myFiat * valToExchange;
        return valueFiatInDollars;
    }

    @Override
    public double dollarsToFinalFiat(double wantedFiatValue) {//FIND OUT HOW THE VALUE OF DOLLARS IN THE FINAL CURRENCY
        this.exchangeTotal = valueFiatInDollars * wantedFiatValue;
        return exchangeTotal;
    }
}
