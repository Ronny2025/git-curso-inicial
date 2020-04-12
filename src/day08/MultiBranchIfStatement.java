package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        // pseudo |sudo code
        /*
        given your currentSpeed, speedLimit
        check whether the current speed is

        more than 90 ==> jail
        more than 80and less than 90 => reckless driving


        ---start from here above two optional
        more than 70 and less than 80 => point taken
        more than 60 and less than 70 => warning

        if not speeding keep driving
        */
        //45, 65, 90 bad idea , condition should always start with top to bottom or
        //more specific
        int currentSpeed = 45;

        if( currentSpeed> 60) {
            System.out.println(" your are speeding more than 70 --points taken!!!");
            //asking whether it is less than or equal 70 and more than 60
        }else if ( currentSpeed>70) {
            System.out.println("your speed is less than or equal 70  but more than  60");
        }else{
            System.out.println("keep driving your are good!!!");


        }


    }
}
