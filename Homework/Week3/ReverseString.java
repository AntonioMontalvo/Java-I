//Reverse the following String
// String title = "Strawberry Fields Forever";
import java.util.Arrays;

public class ReverseString{
    public static void main (String[] args){
        //The original String
        String title = "Strawberry Fields Forever";

        //use String.toCharArray() to convert the string to a new character array.
        char[] titleAsArray = title.toCharArray();

        //Verify title as an array with Arrays.toString
        System.out.println(Arrays.toString(titleAsArray));

        //Create a deep copy
        //Create an empty char array with the size of the title array
        char [] strawberryCopy = new char[titleAsArray.length];

        //filled strawberryCopy with titleAsArray from the end of titleAsArray
        for(int i = 0, j = strawberryCopy.length - 1; i < titleAsArray.length; i++, j--){
            strawberryCopy[j] = titleAsArray[i];
        }

        //Verify strawberryCopy content
        System.out.println(Arrays.toString(strawberryCopy));
        //Convert to String and print
        String reversedTitle =  String.copyValueOf(strawberryCopy);
        System.out.println(reversedTitle);
    }
}
