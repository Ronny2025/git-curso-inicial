package replit;
import java.util.Scanner;
public class Replit063PrintFirstCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.charAt(0));
    }

}
