package replit;
import java.util.Scanner;
public class SecondsConverter032 {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner Scan = new Scanner(System.in);

        int inputSeconds, hours, minutes, seconds;

        System.out.println(" Enter seconds:");

        inputSeconds= Scan.nextInt();
        hours=inputSeconds/3600;//20394/3600=5==>2394

        minutes=(inputSeconds%3600)/60;//2394%60==>54
       // seconds=inputSeconds%3600;
        seconds=(inputSeconds%3600)%60;
       // System.out.println(hours);
       // System.out.println(minutes);
        //System.out.println(seconds);
        System.out.println(hours + " hours, " + minutes +


                " minutes," + " " + "and " + seconds + " seconds");


        }

    }
