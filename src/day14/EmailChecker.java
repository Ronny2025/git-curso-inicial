package day14;

public class EmailChecker {

    public static void main(String[] args) {



       /*
       if it does not contain character @ say invalid email
       if it contains space say invalid email

       if it endsWith @mail.com==> gmail
       if it endsWith @yahoo.com==> yahoo email
       if it endsWith @mail.ru==> russian mail

        */
        String email = "abc@gmail.com";

        if (!email.contains("@") || email.contains(" ")) {

            System.out.println("invalid email");

        } else if (email.endsWith("@gmail.com")) {

            System.out.println("Google Mail ");

        } else if (email.endsWith("@yahoo.com")) {

            System.out.println("Yahoo Mail");

        } else if (email.endsWith("@mail.ru")) {

            System.out.println("Russian mail");

        }




        }

    }





