package HomePractice_01;

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Buenos dias, cual es la clave?");
        String clave = scan.nextLine();

        while (!clave.equalsIgnoreCase("Peru campeon")) {
            System.out.println("Not the right clave, Please enter the clave");
            clave = scan.nextLine();
        }

        System.out.println("open sesame");

    }
}

