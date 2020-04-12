package day12;

public class LoginTest {

    public static void main(String[] args) {


        /*
        String str= "abc";
        str.equals("abc")==> true !str.equals(abc)==> false

        Create a class called LoginTest with main method
        create 2 string variable called username, password and do following
        your correct username password is user123 and pass123
        check if your username and password correct
        if so print login successful

        if notd
        check  whether your username is correct
        if not, say : user name in not correct
        check your password, if it is correct or not
         if not print password is not correct
         */

        String username, password;
        username = "user123";
        password = "pass123";

        if (username.equals("user123") && password.equals("pass123")) {
            System.out.println("login successful");
        } else if (!username.equals(" user123") && password.equals("pass123")) {
            System.out.println("Username is not correct");

        } else if (!password.equals("pass123") && username.equals("user123")) {
            System.out.println("password is not correct");

        } else {
            System.out.println("username and password are wrong");
        }


    }


}

