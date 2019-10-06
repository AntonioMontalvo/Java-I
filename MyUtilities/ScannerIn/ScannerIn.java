// A simple way to capture user keyboard input
import java.util.Scanner;

class ScannerIn
{
    public static void main(String[] args)
    {
        //create the instance for the Scanner class
        Scanner in = new Scanner(System.in);
        //capture the input in a variable
        //Let's try a number
        System.out.print("Type a number: ");
        int num = in.nextInt();
        System.out.println("You typed number " + num);
        //Now Let's try a String

        System.out.print("Type some text: ");
        String text = in.next();
        System.out.println("You typed this text: ' " + text + ".'");
    }

}