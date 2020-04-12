package day12;
import java.util.Scanner;

public class WakeUpTask_Weather {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);
        System.out.println(" Good morning, Enter weather please:");
        String Weather = blabla.nextLine();
        System.out.println(" You entered " + Weather);

        if (Weather.equals("Sunny")) {
            System.out.println(" Code in Sunny Weather");
            if (Weather.equals("Rainy")) {
                System.out.println(" Code in Rainy Weather");
                if (Weather.equals("Cloudy")) {
                    System.out.println(" Code in Cloudy Weather");
                    if (Weather.equals("Snowy")) {
                        System.out.println(" Code in Snowy Weather");

                    } else {
                        System.out.println(" rain or shine we still code");
                    }
                }
            }
        }
    }
}