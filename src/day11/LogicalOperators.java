package day11;

public class LogicalOperators {

    public static void main(String[] args) {

        //combining multiple condition together

        //in java there is a no range check directly like  math
        // for example int x= 70
        // in math : 60 <x <100 ==> true < 100
        // in java : x > 60 && x<100

        //&&  2 ampersand & 1 ampersand ==> logical  AND  operator
        // this is used to check both conditions are true at the same time
        //think about log in example
        // only when your username is right and your password is right at the same time
        //the you will be able to log in
        /*
                           true      true
        int x = 70;     x > 60 && x <100;  true

                           false     true
        int x = 10;     x > 60 && x <100;   false

                          true       false
        int x = 110;     x > 60 && x <100;  false

                          true       true
        int x = 99;     x > 60 && x <100;  true
         */

        System.out.println(" Truth Table");
        System.out.println("Result of true && true is " +  (true && true));
        System.out.println("Result of false && true is " +  (false && true));
        System.out.println("Result of true && false is " +  (true && false));
        System.out.println("Result of false && false is " +  (false && false));


        System.out.println(" Truth Table ||");
        System.out.println("Result of true || true is " +  (true || true));
        System.out.println("Result of false || true is " +  (false || true));
        System.out.println("Result of true || false is " +  (true || false));
        System.out.println("Result of false || false is " +  (false || false));



        //Create a variable called num with type int
        // find out whether this number is more than 100 or less than 10

        //find out the number is within the range of 10-60
        //and print out the result


        int num=40;
       // if (num > 100 || num < 10);
        System.out.println(num > 100 || num < 10  );
        System.out.println(num >10 && num<60);


        //more than 2 condition at the same time , 3 conditions
                                  //true || false ==> true
        System.out.println( true || false || false);

                                //true  &&  false==> false
        System.out.println( true && true && false);














    }
}
