package replit;
import java.util.Scanner;
public class Replit64bPrintLastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.charAt(word.length()-1));
    }
}
