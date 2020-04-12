package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {


        /*checking for String equality should be always
        done using equals method of the String

        oneString.equals(anotherString) ==> true or false
        equals method coming from String Class
        each and every String object you created will have this functionality

        just compering 2 String literal directly using equals method
        this is something that you will rarely
        System.out.println ( "Java".equals("java")       );
         */

        String myStr ="Java";
        System.out.println(  myStr.equals("Java") );
        //IntelliJ display original as helper, it is not part of your code
        //please ignore and keep typing . do not type original just type your text
        String yourStr = new String("Java");

        System.out.println( " is my string same as your string ?");
        //how to compare myStr to yourStr for equality
        System.out.println(       myStr.equals(yourStr)  );


        //Create a program to check whether myStr value is Java
        // if true ==> Correct word !!!!!
        //if false ----SAY JAVA!!!!!!


        if ( myStr.equals("Java")  ){
            System.out.println("Correct word !!!!!");
        }else{
            System.out.println("SAY JAVA!!!!!!!!!");
        }



    }
}
