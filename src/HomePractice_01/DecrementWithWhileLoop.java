package HomePractice_01;

public class DecrementWithWhileLoop {

    public static void main(String[] args) {

        int R = 20;
        while (R >= 20) {
            if (R % 5 != 0) {
                System.out.println(R + " odd number");
            }
            --R;
        }

    }
}