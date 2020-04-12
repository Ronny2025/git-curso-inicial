package HomePractice_01;

import java.util.Scanner;

public class VirusMortal {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int pollos= scan.nextInt();
        int hora=1;
        while(pollos>0){
            System.out.println("Hora " + hora  + " ["+pollos+"]");
            hora++;
            pollos=pollos/2;
        }
        System.out.println(" pollos fueron exterminados");
    }
}
