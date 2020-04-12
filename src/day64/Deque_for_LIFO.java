package day64;
import java.util.*;
public class Deque_for_LIFO {
    public static void main(String[] args) {

        //How do we implement a LifoQueue if not using class class called Stack
        //we can use any of Deque interface implementation
        //Deque is a double

        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("Say bye to Java");

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());

    }
}
