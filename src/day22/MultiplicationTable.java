package day22;

public class MultiplicationTable {

    public static void main(String[] args) {
/*
        System.out.println("1 x1+ " + 1 * 1);
        System.out.println("1 x1+ " + 1 * 2);
        System.out.println("1 x1+ " + 1 * 3);
        System.out.println("Multiplication table of 1");
        for (int base = 1; base <= 12; base++) {
            //  System.out.println("1 X 1="+1*base);
            System.out.println("1 x" + base + "=" + 1 * base);

        }
        System.out.println("Multiplication table of 2");
        for (int base = 1; base <= 12; base++) {
            //  System.out.println("1 X 1="+1*base);
            System.out.println("2 x" + base + "=" + 1 * base);

        }
        System.out.println("Multiplication table of 3");
        for (int base = 1; base <= 12; base++) {
            //  System.out.println("1 X 1="+1*base);
            System.out.println("3 x" + base + "=" + 1 * base);


        }
/*

 */   //this  loop is for iterating number from 1 to10  to get multiplication table
        for (int timesTable = 1; timesTable <=10; timesTable++) {
            //I want to know which number I want to get from the multiplication table
            System.out.println("Multiplication Table of " + timesTable);
            // this loop will generate multiplication table for one number
            for (int base = 1; base <=12 ; base++) {

                System.out.println(timesTable + "x " + base + "=" + timesTable * base);

            }



        }
    }
}