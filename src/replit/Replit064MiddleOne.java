package replit;

import java.util.*;

public class Replit064MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() >= 3 && word.length() % 2 == 1) {
            System.out.println(word.charAt(word.length() / 2));
        } else if (word.length() == 1) {
            for (int i = 0; i < 3; i++)
                System.out.print(word);
        } else if (word.length() >= 4 && word.length() % 2 == 0) {
            System.out.print(word.charAt(word.length() / 2-1));
            System.out.println(word.charAt(word.length() / 2));
        }else if(word.length()==2){
            System.out.println(word + word);
            }

        }
    }

