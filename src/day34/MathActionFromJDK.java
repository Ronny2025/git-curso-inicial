package day34;

public class MathActionFromJDK {

    public static void main(String[] args) {

        //where is String class Coming from?
        //it is calling from a package called java.lang
        //it is a special package
        //and any class  in it , does not need to importing when being used
        //for example String class

        //what if I really want to explicitly import String class
        //import java.lang.String

     //   String str = "Hello";

        //There is a class under java.lang called Math
        //and it has a lots of math utility methods that ready to be used
       int sum= Math.addExact(10,20);
        System.out.println("sum = " + sum);

        System.out.println("max of 10, 20 --> " + Math.max(10, 20));
        ;
    }
}