package day09;

//import javax.swing.*;

public class InitializingAVariable {

    public static void main(String[] args) {

  /*
  int num ;

  a variable inside a method, must get initial valulr
  before it is being  used for the first time
  and there should not be any chance
  this vairable doesnot get value before usage
  System.out.println(num);
   */
        //String name =" ";
        int greeting = 6;
        String languageOption="" ;


        if (greeting == 1) {
            languageOption = "Hello";
        } else if (greeting == 2) {
            languageOption = "Salam";
        } else if (greeting == 3) {
            languageOption = "Hola";
        } else if (greeting == 4) {
            languageOption = "Privet";
        } else if (greeting == 5) {
            languageOption = "Mehaba";
        } else if (greeting == 6) {
            languageOption = "Vonjour";
        } else if (greeting == 7) {
            languageOption = "Azia";
        } else {
            System.out.println(" Unknow");


        }
        System.out.println(" Language Option is:"  + languageOption +", Happy Life SDET");

    }
}