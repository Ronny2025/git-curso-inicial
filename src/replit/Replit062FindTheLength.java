package replit;
import java.util.*;
public class Replit062FindTheLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text= scan.nextLine();
        System.out.println("Length is: " + text.length());

        int x=0;

        while( x<text.length());
        if(text.length()%2==0){
            System.out.println("even");
        }else{
            System.out.println("even");
            --x;
        }
    }
}
