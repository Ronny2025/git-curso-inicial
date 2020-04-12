package day18;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {

    public static void main(String[] args) {
        //smart lock door has password
        //unless you eneter correct paaword
        ///it keep locking you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock knock!!");

          //  String clave;
        String password;

        do {
            System.out.println("what is the password? ");
            password = scan.next();

        }while(! password.equals("B15"));

        System.out.println("door is open!!!");


/*
        do{
            System.out.println("cual es la clave");
            clave=scan.next();
        }while(!clave.equals("peru"));
        System.out.println("se abre la puerta majestad");

 */
    }
}
