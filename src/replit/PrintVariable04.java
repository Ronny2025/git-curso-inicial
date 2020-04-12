package replit;

import java.util.Scanner;

public class PrintVariable04 {

    public static void main(String[] args) {
        /*
        Assume that word is a String variable and already has a value.
        Write a statement to display the message "Today's Word-Of-The-Day is:
        " followed by the value of word.
        The message and the value of word should appear together, on
        a single line.
        Ex:

        Today's Word-Of-The-Day is:Java

         */
        System.out.println("Enter today's word :");
        String word = new Scanner(System.in).nextLine();

        System.out.println("Today's Word-of-the-Day is:" + word);



    }
}
