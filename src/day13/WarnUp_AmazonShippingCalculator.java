package day13;

public class WarnUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        /*
        Amazon has 2 type of user one is prime member and another is regular member
        prime member get free shipping in all purchase no matter the amount
        regular member user get free shipping only if their purchase is more than 25$
        otherwise they get 5$ shipping free
         */
        String memberType = " Prime member ";
        double amount = 15.99d;
        int shippingfee= 0;

        //first I wanna check  it is prime member or not
        if(memberType.equalsIgnoreCase("PRIME MEMBER")) {

            System.out.println(" you get 1 day freeshipping!!!");

            System.out.println("Your final price is " + amount);
          //}else if (amount > 25) {

        }else if(!memberType.equalsIgnoreCase("PRIME MEMBER")&& amount> 25){
            System.out.println(" NOT A PRIME MEMBER BUT ORDER IS MORE THAN 25");
            System.out.println("YOU GOT FREE SHIPPING");



        }else {
            System.out.println(" DO YOU WANNA SIGN UP FOR FREE PRIME MEMBERSHIP? ");
            shippingfee = 5;
            amount = amount+ shippingfee; //amount += shippingfee
            System.out.println("YOUR FINAL AMOUNT IS " + amount);
        }



    }
}
