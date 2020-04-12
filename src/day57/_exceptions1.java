package day57;

import java.sql.SQLOutput;

public class _exceptions1 {
    public static void main(String[] args) {
        System.out.println("BEFORE TRYCATCH");
        try {
            System.out.println("In try block");
            int result = 10 / 0;
            System.out.println("After 10/0 line");
        } catch (ArithmeticException e) {
            System.out.println("Exception happened , and was caught and handled!");
        }
        System.out.println("AFTER TRY CATCH");

        try {
            System.out.println("Insecodns try blocks");
            String str = "java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        } catch (Exception e) {
            System.out.println("Exception happend in try Block and caught!");

        }
        System.out.println("AFTER SECOND TRY CATCH..");

    }

}



