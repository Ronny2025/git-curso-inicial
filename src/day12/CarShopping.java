package day12;

public class CarShopping {

    public static void main(String[] args) {

        //Buy corolla( ( DOES NOT MATTER WHAT IS THE BUDGET)
        // //OR
        //  tesla ( only if it is within the budget THIS CONDITION ONLY APPLY FOR TESLA)

        //there is only one car covered with cloth
        //we dont know what car is it and what is the price
        //once we take out the cloth
        //we check  whether its toyota , if it is we buy it without checking the price
        //if it is not we check if its a tesla and also check whether it is within the budget
        //else we just say not what we are looking for

        String carBrand = "Corolla";
        int carPrice = 60000;
        int budget = 60000;

      //  if (carBrand.equals(" Corolla ") || (carBrand.equals(" Tesla ") && carPrice <= budget)) {

      //      System.out.println(" CAR ACQUIRED!!!");
      //  } else {
       //     System.out.println(" NOT WHAT I AM LOOKING FOR ");

        if (carBrand.equals("Corolla")) {
            System.out.println(" CAR ACQUIRED!!!!");

        }else if( carBrand.equals("Tesla")&& carPrice <= budget){
            System.out.println(" CAR ACQUIRED!!!");
        }else {
            System.out.println("Not what I am looking for");
        }
    }
}
