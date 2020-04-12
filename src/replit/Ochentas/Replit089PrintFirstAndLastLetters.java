package replit.Ochentas;
import java.util.Scanner;
public class Replit089PrintFirstAndLastLetters {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        //System.out.println(word.index(0));
        //System.out.println(word.length()-1);
       // System.out.println(word.indexOf(0) + word.length()-1);
        char firstLetter = (word.charAt(0));
        System.out.println(word.charAt(0));
        char lastLetter=(word.charAt(word.length()-1));
        System.out.println(lastLetter);

        System.out.println(word.charAt(0) +""+""+word.charAt(word.length()-1));
    }
}
