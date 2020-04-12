package day30;
import java.util.Arrays;


public class SplitPractice {
    public static void main(String[] args) {

        /* what does split do/
        it will split the String into multiple part

        what do I need to provide when calling it?
        we need to provide the separator

        what do I get out of it
        we get a string array out of it with each part splitted

        does it actually change your original string?
        No!!
         */
     /*   String car = "Lexus-IS-F";
        String[] carSplitted = car.split("-");
        System.out.println("carSplitted = " + Arrays.toString(carSplitted));

        String model = carSplitted[1];
        System.out.println("model = " + model);
/*
      */
        String car = "Lexus-IS-F";
      //  String[] carSplitted = car.split("-");
        String[] carSplitted = car.split("-", 2);
        System.out.println("carSplitted = " + Arrays.toString(carSplitted));
        System.out.println("car = " + car);

        String model = carSplitted[1];
        System.out.println("model = " + model);

    }
}
