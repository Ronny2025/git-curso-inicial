package replit;
import java.util.Scanner;
public class CaffeineOverDose033 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int numOfMiligrams, drinks;
        System.out.println("Enter number of milligrams in drink:");
        numOfMiligrams=Scan.nextInt();
        drinks=10000/numOfMiligrams;
        System.out.println("It would take about " + drinks+ " drinks for a lethal overdose.");


    }
}
