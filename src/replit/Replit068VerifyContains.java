package replit;
import java.util.Scanner;
public class Replit068VerifyContains {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean yes = true;
        if (sentence.contains(word)) {
            System.out.println(yes);

        } else {
            System.out.println(false);
        }
    }
}
