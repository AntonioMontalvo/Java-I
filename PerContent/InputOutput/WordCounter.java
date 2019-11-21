import java.io.FileReader;

import java.util.Hashtable;
import java.util.Scanner;


public class WordCounter {

        private Hashtable<String, Integer> count = new Hashtable<String, Integer>();

        private void count_words(String content, Integer occurrences){
            count.put(content, occurrences);
        }

         private void displayCount(){
             count.forEach((k, v) -> System.out.println("Word : " + k + ", Times : " + v));
         }

         private int checkOccurrences(String word){
            int currentKey = 1;
            if(count.containsKey(word)){
              currentKey = count.get(word)+1;
            }return currentKey;
         }

    public static void main(String[] args){
        WordCounter wc = new WordCounter();
        int totalAmountOfWord = 0;
        try{
            Scanner in = new Scanner(new FileReader("ohhBaby.txt"));
            while(in.hasNextLine())
            {
                String content = in.next().toLowerCase() ;

                if(content.endsWith(",") || content.endsWith(")") || content.endsWith("?") || content.endsWith("'")){//get rid of the comas and parenthesis ",";
                    content = content.substring(0, content.length()-1);
                }
                if(content.startsWith("(")){//get
                    content = content.replace("(", "");
                }
                if(content.startsWith("'")){
                    content = content.replace("'", "");
                }
                wc.count_words(content, wc.checkOccurrences(content));
                totalAmountOfWord ++;
            }
            System.out.println("");
            System.out.println("Justin Bieber used " + totalAmountOfWord + " words for this song.");
            System.out.println("");
            System.out.println("Here is a list of all the words used, and the amount of times each word was used.");
            System.out.println("");
            wc.displayCount();
        } catch (Exception e){
            System.err.println("Error " + e.getMessage());
        }
    }
}