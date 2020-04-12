package day08;

public class IfStatement {

    public static void main(String[] args) {

        int speedLimit = 101;

        int yourCurrentSpeed = 100;

        //if the yourCurrentSpeed is more than speed Limit
        //get pulled over by the police
        //given ticket by the police
        // taken away some points on your license
        // go to court

        boolean IamSpeeding=  yourCurrentSpeed>speedLimit;
        //inside parenthesis we can only put
        //boolean value
        //boolean variable
        //any expression that return boolean value

        if(IamSpeeding) {
            System.out.println("get pulled over the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some point on your lisence");
            System.out.println("go to court");
        }else {
            System.out.println("go to shopping !!");
            System.out.println("buy iceCream!!");
            System.out.println("Enjoy your day!!");
        }

        System.out.println("The End");

            }
        }






