package day58_exceptions2;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try{
            System.out.println("Hello From try block");
            String str = null;
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println(" Exception happened and caught");
        }
        System.out.println("After try catch");
        try{
            System.out.println("Hello From try block");
            String str = null;
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println(" Exception happened and caught");
        }finally{
            System.out.println("Finally block.Run if there is exception or no exception");
        }
    }
}
