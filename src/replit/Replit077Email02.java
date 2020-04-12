package replit;
import java.util.Scanner;
public class Replit077Email02 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String email = scan.next();

    String name = email.substring(0,email.indexOf("_"));
    String lastName =email.substring(email.indexOf("_")+1,email.indexOf("@"));
    String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
    String topdomain=email.substring(email.indexOf(".")+1);

    String name1=name.substring(0,1);
    String name2= name1.toUpperCase();
    String lastName1=lastName.substring(0,1);
    String lastName2= lastName1.toUpperCase();

    System.out.println("First name: "+ name2 +email.substring(1,email.indexOf("_")));
    System.out.println("Last name: "+lastName2.toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));
    System.out.println("Domain: "+ domain);
    System.out.println("Top-Level Domain: "+topdomain);

}
}
