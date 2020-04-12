package replit;
import java.util.Scanner;
public class PrintVariable012 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num");
        int num = in.nextInt();
        System.out.println("Enter cost");
        double cost = in.nextDouble();

        System.out.println(num +"\t" + cost);

    }
}
