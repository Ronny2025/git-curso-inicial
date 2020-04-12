package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {

    public static void main(String[] args) {

        Scanner ronny = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = ronny.next(); //it will only capture first word 9 separated by space)

        System.out.println("You have entered " + name);
        String anotherWord = ronny.next();
        System.out.println("You have entered another word " + anotherWord);





    }
}
