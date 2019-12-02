package view;
import controller.CaptureInput;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PromptUser{

    private String myFiatSymbol = "";

    private boolean isDouble;
    private String myWantedSymbol = "";

    Scanner userInput = new Scanner(System.in);  // Create a Scanner object
    CaptureInput testing = new CaptureInput();

    public String  askFiatToExchange() throws FileNotFoundException {
        do {
            System.out.println("/////////////////////////////");
            System.out.println( "Introduce the symbol for the type of fiat currency you want to EXCHANGE. \n" +
                    "For your convenience, a list of symbols is provided above.");
            myFiatSymbol = userInput.nextLine().toUpperCase();
            if(testing.verify3Symbol(myFiatSymbol) ){
                System.out.println("******ATTENTION*********");
                System.out.println("Please remember; the symbol you need to type is 3 letters only!  <~~~");
            }
            if(!testing.verifySymbolExists(myFiatSymbol)){
                System.out.println("******ATTENTION*********");
                System.out.println("That 'symbol' " + myFiatSymbol + " is not in our data base. Check your spelling and try again. <~~~");
            }

        } while(testing.verify3Symbol(myFiatSymbol) || !testing.verifySymbolExists(myFiatSymbol));
        // Read user input to uppercase
        System.out.println("You have selected " + myFiatSymbol + " as your currency to exchange.");
        return myFiatSymbol;
    }

    public String askWantedFiat() throws FileNotFoundException {
        do {
            System.out.println( "Introduce a second symbol for the currency you  want to GET");
            myWantedSymbol = userInput.nextLine().toUpperCase();
            if(testing.verify3Symbol(myWantedSymbol)){
                System.out.println("Please remember, the symbol you need to type is 3 letters only! <~~~");
            }
            if(!testing.verifySymbolExists(myWantedSymbol)){
                System.out.println("That 'symbol' " + myWantedSymbol + " is not in our data base. Check your spelling and try again. <~~~");
            }
        } while(testing.verify3Symbol(myWantedSymbol) || !testing.verifySymbolExists(myWantedSymbol));
        // Read user input to uppercase
        System.out.println("The symbol of the currency you want is: " + myWantedSymbol);
        return myWantedSymbol;
    }

    public double askAmount(){
        double myFiatAmount = 0.0;
        do{
            System.out.println("Introduce the AMOUNT you want to exchange. Type a double." );

            if(userInput.hasNextDouble()){
                myFiatAmount = userInput.nextDouble();
                isDouble = true;
            } else {
                System.out.println("YOU are trying to trick me! Enter a double NOW! <~~~");
                isDouble =false;
                userInput.next();
            }
        }while (!(isDouble));
        return myFiatAmount;
    }

}
