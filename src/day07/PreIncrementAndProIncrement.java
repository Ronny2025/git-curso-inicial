package day07;

public class PreIncrementAndProIncrement {

    public static void main(String[] args) {


        //increment a
        int apple  =8;

        apple++;

        System.out.println( apple );//printing the increased value

       // System.out.println(++ apple);//increasing the value and print value

        //apple++ , when comes after the variable
        //it is calles post increment
        //it will increase the value
        //But it will reflect the increased the value next time the variable show up!!
        System.out.println( apple++);
        System.out.println(apple);

        int score = 50;

        System.out.println(++ score); //51

        System.out.println(score ++); //51 and ready to be 52 next time it shows up

        System.out.println( score);//52

        System.out.println( -- score); //51

        System.out.println( score --);//still 52

       // System.out.println(--score); //51

    }
}
