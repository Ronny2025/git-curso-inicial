package office_hour.ExceptionPractice;

public class ExceptionPractice {
    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch(IndexOutOfBoundsException e){
            System.out.println("index out of bondException is handled");

        }catch(ClassCastException e){
            System.out.println("calss cast exception is handled");

        }catch(ArithmeticException e){
            System.out.println("Airithmatic exception es handled");

        }catch(IllegalStateException e){
            System.out.println("Illigal state exception");
        }
        System.out.println("Test Completed");
    }
}
