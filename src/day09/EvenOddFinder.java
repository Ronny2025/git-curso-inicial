package day09;

public class EvenOddFinder {

    public static void main(String[] args) {

        int myNumber = 99;
        int remainder = myNumber % 2;
        System.out.println(myNumber / 2);
        System.out.println(myNumber % 2);

        if (remainder == 0) {
            System.out.println("it is an even number");
        } else {
            System.out.println(" it is an odd number");
        }

    }
}
