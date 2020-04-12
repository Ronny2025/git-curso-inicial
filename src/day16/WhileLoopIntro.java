package day16;

public class WhileLoopIntro {

    public static void main(String[] args) {

        //print hello world 5 times
        //also keep the count of how many times you said hello
        int count = 1;
        System.out.println("Hello World");
        //count = count + 1;
        //count+=1;
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;

        System.out.println("--------------------");

        int cnt=1;
        while(cnt<=5){
            System.out.println("Hello World");
            System.out.println("cnt value is " + cnt);
            ++cnt;//increase the value by one
        }
        /*1st in the loop:
        cnt =1
        check this 1<=5 ==> true
        hello world
        cnt value is 1
        increase the value cnt value to 2

        2st in the loop:
        cnt =1
        check this 2<=5 ==> true
        hello world
        cnt value is 1
        increase the value cnt value to 3

        3st in the loop:
        cnt =1
        check this 3<=5 ==> true
        hello world
        cnt value is 1
        increase the value cnt value to 4

        4st in the loop:
        cnt =1
        check this 4<=5 ==> true
        hello world
        cnt value is 1
        increase the value cnt value to 5

        5st in the loop:
        cnt =1
        check this 5<=5 ==> true
        hello world
        cnt value is 1
        increase the value cnt value to 6

        6th time is the loop ; cnt=6
        check this 6<===> false
        GET OUT OF THE LOOP!!!!!!!!!

         */
    }
}
