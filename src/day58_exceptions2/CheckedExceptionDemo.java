package day58_exceptions2;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Check Exception in next line");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception was caught!");
        }
        System.out.println("After Thread.sleep");
    }
}