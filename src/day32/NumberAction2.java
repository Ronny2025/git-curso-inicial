package day32;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;

public class NumberAction2 {

    public static void main(String[] args) {
       // int num1,num2;

        numberComparision(4,7);
        numberComparision(10,10);
        numberComparision(56,611);
        stringRepeater("java",6);
        stringRepeater("malcirados",16);
    }


    /**
     * Create static void methods as below
     *
     * numberComparision
     * this method has 2 parameters called num1 and num2
     * if num1 is more than num2 print num1 is more than num2
     * if num2 is more than num1 print num2 is more than num1
     * if num2 are equals num1 print they are equal
     *
     * String repeater
     * this method has 2 parameters
     *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
     *
     * skipCountBy3From0to50
     *
     * * create a method that has no parameter
     * and skip count by 3 from 0 to 50
     *
     * countDownByEvenNumberFrom50to0
     * * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     *
     * print1toX
     * * create a method that has 1 int parameter called x
     * print from 1 to that number in one line
     * print an empty line after the print.

     *
     *
     */

    public static void numberComparision ( int num1,int num2) {
        if(num1>num2){
            System.out.println(num1 +" is more than " + num2);
        }else if(num2>num1){
            System.out.println(num2 +" is more than " + num1);
        }else{
            System.out.println("They are equal");
        }
        System.out.println();

    }

    public static void stringRepeater(String strToRepeat, int Count) {

        for (int i = 1; i < Count; i++) {
            System.out.println(strToRepeat);
        }



    }
}


