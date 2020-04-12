package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

        int catCount = 20 ;

        byte letterCount =26;
        System.out.println(" The letter count is " + letterCount  );

        short sheepCount = 300;
        System.out.println("the sheepCount is "  + sheepCount);
        long mileToMoon = 5000000l;
        System.out.println(" The mileToMoon is " +  mileToMoon );
        long mileToSun= 10000000L;
        System.out.println(" the mile to sun is "  + mileToSun);

        //---------------floating point--------
        // ypu must add f at the end of number to indicate this float
        // uppercase lowercase does not matter, but it is mandatory
        float priceOfBanana = 1.99f;  //always add the f for  float number.
        float priceOfPotatoe = 2.49F;

        //-----------------larger floating point numbers-------------
        double priceOfIpad1  = 355.99d;
        double priceOfIpadPro= 1024.99D;
        //compile automatically assume it  is a double so it is not required to have d
        //however for good programming habbit, add them always
        double priceOfMac    = 2299.99;

        //if you have a whole number by itself, compiler automatically assume it is an int



    }
}
