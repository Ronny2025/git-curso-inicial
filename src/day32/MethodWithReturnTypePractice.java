package day32;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {

        System.out.println(divide (10,3));

        System.out.println(divide (10,0));
        
    }//create a method called divide
    //it has 2 double parameters and return the result as double
    //
    public static double divide(double num1, double num2){
        return num1/num2;
    }
}
