package day20;

public class Gert2SiblingChar {

    public static void main(String[] args) {
        // given a String with even number character count
        // print 2 characters in one line
        // 01234567
        // for example  : Ayra
        /*

         String name = "Gokyuzum";
        int charCount = name.length();
        int lastCharIndex = charCount - 1;


        // my condition is x<=charCount-2  or  x<= lastCharIndex-1

        for (int x = 0; x <= lastCharIndex - 1; x += 2) {

            System.out.println(name.substring(x, x + 2));

           Ay
           yr
           ra
         */

        String name ="Ayra";
        int charCount = name.length();
        int lastCharIndex= charCount -1;

        for(int x=0;x<=lastCharIndex-1 ; x++){
            System.out.println(name.substring(x,x+2));

        }

    }
}
