package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        double[]prices = new double[5];

        System.out.println( prices[0]);
        //can not  print out array variable directly
        //to see what is inside
      //  System.out.println( prices);

        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;
        //what happen if I go over the range
        //run time error!!!
        //prices[5]= 165.3;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        // create a char array that hold all the letters  from your first name
        //and assign values using each character oy your  first name.

        //then print out each character

        char[]chino=new char[5];
        //what default value do we get fo char array
        // we get a char represented by ascii code 0


        chino[0]='c';
        chino[1]='h';
        chino[2]='i';
        chino[3]='n';
        chino[4]='o';

        System.out.println(chino[0]);
        System.out.println(chino[1]);
        System.out.println(chino[2]);
        System.out.println(chino[3]);
        System.out.println(chino[4]);
        //THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        //AND THIS IS ONLY FOR CHAR ARRAY, ANYTHONG ELSE WILL PRINT MEMORY ADDRESS
        //System.out.println(chino);

        boolean[] yesNo = new boolean[3];
        System.out.println( yesNo[0]);
        System.out.println( yesNo[1]);
        System.out.println( yesNo[2]);

        yesNo[0]=true;
        yesNo[1]=false;
        yesNo[2]=10>7; //true;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);










    }
}
