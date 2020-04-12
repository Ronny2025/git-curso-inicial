package replit.Noventas;
import java.util.Scanner;
public class Replit092Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
     long fact = 1;



        for(int i=1;i<=n;i++){
        fact*=i;
        }
        System.out.println(fact);
    }
}





