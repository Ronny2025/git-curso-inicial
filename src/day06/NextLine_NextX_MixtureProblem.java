package day06;

import javax.swing.*;
import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner carrasco = new Scanner( System.in);

        System.out.println("What is your name ? ");
        String name = carrasco.nextLine();
        System.out.println("Your Name is " + name);

        System.out.println("What is your age ? ");
        int age = carrasco.nextInt();
        //String age = carrasco.nextLine();
        //notice we are no storing thiss into variable
        //we just want below line to capture ENTER keyboard input
        //so that it does not accidentally get captures by
        //the nextLine we use to capture address carrasco.nextLine();

        System.out.println("Your Age is " + age );

        System.out.println("What is Your Address ? ");
        String address = carrasco.nextLine();
        System.out.println("Your Address is " + address);

    }
}
