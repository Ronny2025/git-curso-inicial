package day25;
import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args) {

        String sentence ="I love Java";
        //What does it do?
        //split(by Something) is a method of String that split string into multiple part
        //DO i NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD?
        //yes, we need  to tell what to do we use while splitting, in thisexample space
        //WHAT DO I GET OUT OF IT?
        //we get out String array
        String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence ? : " + allWords.length);

        // How do I get the last word of the sentence using this array i GOT from String
        System.out.println("Last word in this sentence is " + allWords[allWords.length - 1]);

        // ARE WE LIMITED TO SPLIT BY SPACE OR WE CAN SPLIT BY ANYTHING ?   -->> ANYTHING

        String sentence2 = "Everything is Awesome!!!";
        // split by letter e
        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));
        // using for each loop to iterate over the resulting array
        for (String eachPiece : splitBy_e_Arr) {
            System.out.println("eachPiece = <" + eachPiece + ">");
        }

        // split this sentence by is and print out your result


    }

}


