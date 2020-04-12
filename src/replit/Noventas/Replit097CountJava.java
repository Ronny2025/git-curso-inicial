package replit.Noventas;
import java.util.*;
public class Replit097CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int count = 0;
//        int lastChartIndex=word.length()-1;
//
//        for (int i = 0; i <=lastChartIndex-3; i++) {
//
//            String current4chars =word.substring(i,i+4);
//
//            if(current4chars.equalsIgnoreCase("java")){
//                count++;
//            }
//
//        }
//        System.out.println( count);
        for (int i = 0; i <=word.length()-4 ; i++) {
            String encuentra= word.substring(i,i+4);
            if(encuentra.equalsIgnoreCase("java")){
                count++;
            }

        }
        System.out.println(count);
    }
}

