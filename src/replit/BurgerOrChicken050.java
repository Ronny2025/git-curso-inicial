package replit;
import java.util.*;
public class BurgerOrChicken050 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.next();
        if (in.equals("burger") || in.equals("chicken")) {
            System.out.println(10.0);
        }else if(in.equals("soda")){
            System.out.println(2.0);
        }
    }
}