package day07;

public class Casting {

    public static void main(String[] args) {

        //int num = 10;

        //implicitly(automatically) converted to double 10.0
        //and store inside bigNum scene
        double bigNum = 10;
        System.out.println(bigNum);

        //12.99 is double' double has much bigger range than int
       // so it just does not fit
        //int num = 12.99;

        int num = (int) 12.99;
        System.out.println(num);

        //create a long variable and store int
        long earthToMoon = 10000;//==> 10000L
        //crate an int variable and try to store above value
        int earthToMoonIn_blabla=(int)earthToMoon;

        System.out.println( earthToMoonIn_blabla);


    }
}
