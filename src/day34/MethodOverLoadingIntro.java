package day34;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {

        System.out.println("Method overloading");
        System.out.println(12);
        //            01234567890
        String name= "Overloading";
        System.out.println( name.substring(6));
        System.out.println(name.substring(1,4));
        //two version of indexOf method (there are 4)
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));

       // Arrays.toString has 9 different version to accept different parameter

        //Method overloading:
        //using same name and different parameter for methods
        //to reuse the name for similar actions
        //IY DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER

        //method name+ parameter list = method signature


        //WE CAN NOT HAVE 2 METHOD WITH SAME METHOD AND SAME PARAMETERS


        sayHello();
        sayHello("Universe");
        sayHello("Denis");
        sayHello(100);
        System.out.println(sayHello("Muge", "Orman"));
    }

    public static void sayHello(){
        System.out.println("Hello, World");
    }
    public static void sayHello(String name){
        System.out.println("Hello, " + name);

    }
    public static void sayHello( int num){
        System.out.println("Hello, "+num);
    }
    //this is regarded as same method as above method
    //public static void saHello(intx){
    //}
    public static String sayHello(String firstName, String lastName ) {
        return "Hello " + firstName + " " + lastName;

    }

    }
