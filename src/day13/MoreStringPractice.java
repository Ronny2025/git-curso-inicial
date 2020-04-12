package day13;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Pumkin";

        System.out.println(name);
        // name = " Bulent";

        //   System.out.println(name);

        //String is inmutable, once created it can not be changed
        //any string actions/ method that like changing the variable
        //actually creating a new String

        name.toUpperCase();
        System.out.println(name);

        System.out.println(name.toUpperCase());

        //what if I really want to change the name

        name= name.toUpperCase();
        System.out.println(name);


    }
}
