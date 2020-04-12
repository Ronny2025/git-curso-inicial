package day22;

public class StringArray {

    public static void main(String[] args) {

        //create a String with size that you define
        //and store all household member names

        String[]chinoFamily=new String[5];
        chinoFamily[0]=" Norelvy";
        chinoFamily[1]=" Angelo";
        chinoFamily[2]=" Matthew";
        chinoFamily[3]=" Andrew";
        chinoFamily[4]=" Ronny";


        System.out.println(chinoFamily[0]);
        System.out.println(chinoFamily[1]);
        System.out.println(chinoFamily[2]);
        System.out.println(chinoFamily[3]);
        System.out.println(chinoFamily[4]);


        //immutable means you can not change  the internal structure of the object
        //if you have String abc = "Hello"
        //if you do abc. to Uppercase==> it will create new string object "HELLO"
        //and it does not change original HELLO al all!!!

        // not resizable --> specifically for array
       // we can not change the size of array once we create them with certain size
       // However , we can change the elements inside this array
       // and it means : IT IS NOT IMMUTABLE





    }
}
