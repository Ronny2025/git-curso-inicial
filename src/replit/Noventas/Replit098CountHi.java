package replit.Noventas;
import java.util.*;
public class Replit098CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count=0;

        for (int i = 0; i <=str.length()-2 ; i++) {
            String encuentra= str.substring(i,i+2);
            if(encuentra.equalsIgnoreCase("Hi")){
                count++;
            }

        }
        System.out.println(count);
    }
}


