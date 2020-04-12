package day17;

public class
SkipCounting {

    public static void main(String[] args) {

        //Skip counting by 3 from0 till 30
        //3 6 9 12 15 18 21 24 27 30

        int counter = 0;
        while (counter < 30) {


            //  counter = counter + 3;
            counter += 3;
            System.out.print(counter + " ");

           // System.out.println(" ");
        }

        // write a program to print out a even number from 0 to 50;
        // write a program to print out a odd number from 0 to 50;

        int even = 0;
        while (even <= 50) {
            even += 2;//even = even +2;

        }

        System.out.print(even + " ");
           // System.out.print("");


            int odd = 1;
            while (odd <= 50) {
                odd += 3;
                System.out.print(odd + " ");
            }
        }
    }
