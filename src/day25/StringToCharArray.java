package day25;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        String name = "Anastaiya";

        char[]allCharsInName = name.toCharArray();

        for( char eachChar : allCharsInName){
            System.out.println("eachChar =" +eachChar);
        }

        //now count how many a we have
        int count=0;
        for(char eachChar:allCharsInName){

            if(eachChar=='a'){
                ++count;

            }
        }
        System.out.println("couont =" + count);

        //what if you want to sort all characters of your name
        // in alphabetical order?
        Arrays.sort(allCharsInName);
        System.out.println("AFTER SORTING allCharsInName= " + Arrays.toString(allCharsInName));
    }
}


