package replit;
import java.util.*;
public class ConditionalStamentPractice2_047 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        if(num%2==0){
            System.out.println(num + " is even");
        }else if(num%2!=0){
            System.out.println(num + " is odd");
        }
    }
}
