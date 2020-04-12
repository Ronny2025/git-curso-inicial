package replit.Ochentas;
import java.util.Scanner;
/*
Print true if the string "cat" and "dog"
 appear the same number of times in the given string word.
 */
public class Replit088CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
//        while(word.contains("cat")&&word.contains("dog")){
//            System.out.println("true");
//
//            countOfCats=+1;
//            countOfDogs=countOfDogs+1;
//            break;
//        }

        if (word.contains("cat") && word.contains("dog")) {
//            countOfCats = countOfCats + 1;
//            countOfDogs = countOfDogs + 1;
            System.out.println("true");
        } else if (word.contains("cat") || word.contains("dog")) {
                System.out.println("false");

            }
        }
    }




