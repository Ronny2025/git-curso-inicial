package replit;
import java.util.*;
public class Replit078SMSmessage {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
       // String mensaje =
              // 01231456789d123456789v123456789t123456789c123456789C123456789s123456789S123456789o123456789n1234
               // "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

        System.out.println("Sender: "+ message.substring(message.indexOf("<")+1,message.indexOf(">")));
        System.out.println("Phone Number: "+message.substring(message.indexOf("[")+1,message.indexOf("]")) );
        System.out.println("Message body: "+message.substring(message.indexOf("{")+1,message.indexOf("}")));
        }
}
