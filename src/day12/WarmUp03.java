package day12;

public class WarmUp03 {

    public static void main(String[] args) {
        // create a class called FizzBuzznumberCheck with main method given a number, create
        //varible int num
        /*given a number if this number can be divided by 5 without remainder lets call it Fizz number
        for example 5,15,25,100
        if this number can be divided by 3 without remainder lets call it Buzz number
        for example 3,15,9,27
        if this number can be divided by 3 and 5 lets print FizzBuzz number
        for example 15,45,30,90
        if not match, just say NOT MY NUMBER!!!
         */
        int num=75;
        if (num%5==0){
            System.out.println("Fizz number");
        }else if(num%3==0){
            System.out.println( "Buzz number");
        }else if (num%3==0&&num%5==0){
            System.out.println(" FizzBuzz number");
        }else{
            System.out.println("NOT MY NUMBER");
        }

    }
}
