package day17;

public class NameLength {

    public static void main(String[] args) {
      //               012345678901
        String name = "Ronny Angulo";
        int lastCharacterIndex= name.length()-1;
        while(lastCharacterIndex >=0) {

            System.out.println("index " + lastCharacterIndex + ":" + name.charAt(lastCharacterIndex));
            --lastCharacterIndex;
        }
        }
    }

