package day30;
import java.util.Arrays;

public class SplitAndDefineTheSize {

    public static void main(String[] args) {
//split method has 2 version: first split by some separator
        //and get whatever the count of item we get from the result
        //second version : accept  2 external data
        //one is the separator another is the limit of your array saize
        // so if you have 5 word in a sentence if you split by sapace and put the limit for 2
        // then yu will get an array  with size 2==> [ first word, the rest of the sentence}


        String sentence = "I love Java Java Java";

        String[] wordsArray = sentence.split(" ");

        System.out.println("wordsArray = " + Arrays.toString(wordsArray));
    }
}
