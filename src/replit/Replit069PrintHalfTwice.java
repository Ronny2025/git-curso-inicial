package replit;
import java.util.Scanner;
public class Replit069PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
       // System.out.println(word.length()/2-1);
        String a=word.substring(0,word.length()/2);
        String b=word.substring(0,word.length()/2);
      //  System.out.println(word.substring(0,word.length()/2) + word.substring(0,word.length()/2));
        System.out.println(a+b);
    }
}
