package HomePractice_01;

import java.sql.SQLOutput;

public abstract class AppleDevice {
    public abstract void start();

    }
   class AppleTablet extends AppleDevice{
    @Override
       public void start(){
           System.out.println("Press upright bottom");
       }
   }

   class AppleBook extends AppleDevice{
    @Override
       public void start(){
        System.out.println("Press butoom at the bottom");

       }
       protected void start2(){
           System.out.println("Call: Siri start");
       }

   }

  abstract class AppleCar extends AppleDevice{
    public abstract void electrical();
  }

  class uberCar extends AppleCar{
    @Override
      public void start(){
        System.out.println("Press green bottom");
    }
    @Override
      public void electrical(){
          System.out.println(" Has batteries");
    }
  }

   class Test{
       public static void main(String[] args) {
           AppleTablet d1 = new AppleTablet();
           d1.start();

           System.out.println("=======================================================");

           AppleBook d2 = new AppleBook();
           d2.start();
           d2.start2();

           uberCar d3 = new uberCar();
           d3.start();


               }



               }





