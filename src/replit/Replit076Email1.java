package replit;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Replit076Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // String email = scan.next();
        String email = "mike_tyson@gmail.com";
           // System.out.println(email.substring((0),email.indexOf("_")));
       // System.out.println(email.substring(0,email.indexOf("_")));
        String name = email.substring(0,email.indexOf("_"));

       // System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@")));
        String lastName =email.substring(email.indexOf("_")+1,email.indexOf("@"));

        //System.out.println(name);
        //System.out.println(lastName);

        System.out.println(name);
        System.out.println(lastName);
        System.out.println(email.replace(name,email.substring(email.indexOf("_")+1,email.indexOf("@"))));
        System.out.println(email.replace(lastName,email.substring(0,email.indexOf("_"))));
       // String newEmail=email.replace(name,lastName);
       // System.out.println(newEmail.replace(lastName,name));
    }

    }

