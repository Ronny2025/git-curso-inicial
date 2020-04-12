package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

 String name =" Ronny Stone";

        System.out.println( "name.contains(\"st\") RESULT IS:  " + name.contains("st"));
        //I wanna check whether this name contains st no matter the case
        // so i want to store the uppercasse version of this name then check ST

        String uppercaseName = name.toUpperCase(); //"ARYA STARK"
        System.out.println("uppercasename contains ST or not?" + uppercaseName.contains("ST"));

        String lowercaseName= name.toLowerCase();//"arya stark";

        //this is called method chaining, combining multiple method call
        //make my name all lowercase then check whether it contains lowercase st

        System.out.println(name.toLowerCase().contains("st"));//this works because
        //system.out.println(name.length().toUppercase() ); bad idea!!!!

    }
}
