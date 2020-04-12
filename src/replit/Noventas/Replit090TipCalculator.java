package replit.Noventas;
import java.util.*;
public class Replit090TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String Split=scan.next();

        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();

        System.out.println("Check amount:");
        double CheckAmount = scan.nextDouble();


        System.out.println("Service Quality:");
       String ServiceQuality = scan.next();

        System.out.print("Number of people entered: ");
        for (int i = 1; i <=numberOfPeople; i++) {
            System.out.print("&");
        }
        System.out.println();


        if (ServiceQuality.equals("Poor")) {
            System.out.println("Total to pay: " + (0.05 * CheckAmount + CheckAmount));
            System.out.println("Total tip: " + (0.05 * CheckAmount));
            System.out.println("Total per person: " + ((0.05 * CheckAmount + CheckAmount)/numberOfPeople));
            System.out.println("Tip per person: " + (0.05 * CheckAmount)/numberOfPeople);
        } else if (ServiceQuality.equals("Fair")) {
            System.out.println("Total to pay: " +(0.10 * CheckAmount + CheckAmount));
            System.out.println("Total tip: " + (0.10 * CheckAmount));
            System.out.println("Total per person: " + ((0.10 * CheckAmount + CheckAmount)/numberOfPeople));
            System.out.println("Tip per person: " + (0.10 * CheckAmount)/numberOfPeople);
        } else if (ServiceQuality.equals("Good")) {
            System.out.println("Total to pay: " +(0.15 * CheckAmount + CheckAmount));
            System.out.println("Total tip: " + (0.15 * CheckAmount));
            System.out.println("Total per person: " + ((0.15 * CheckAmount + CheckAmount)/numberOfPeople));
            System.out.println("Tip per person: " + (0.15 * CheckAmount)/numberOfPeople);
        } else if (ServiceQuality.equals("Great")) {
            System.out.println("Total to pay: " +(0.20 * CheckAmount + CheckAmount));
            System.out.println("Total tip: " + (0.20 * CheckAmount));
            System.out.println("Total per person: " + ((0.20 * CheckAmount + CheckAmount)/numberOfPeople));
            System.out.println("Tip per person: " + (0.20 * CheckAmount)/numberOfPeople);
        } else if (ServiceQuality.equals("Excellent")) {
            System.out.println("Total to pay: " +(0.25 * CheckAmount + CheckAmount));
            System.out.println("Total tip: " + (0.25 * CheckAmount));
            System.out.println("Total per person: " + ((0.25 * CheckAmount + CheckAmount)/numberOfPeople));
            System.out.println("Tip per person: " + (0.25 * CheckAmount)/numberOfPeople);

        }
    }
}