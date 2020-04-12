package HomePractice_01;

public class Lechugas extends Verduras {

    @Override
    public void seComen() {
        System.out.println("Lechugas se comen en ensaladas");
       // super.seComen();
    }

    public static void main(String[] args) {

        Lechugas v1= new Lechugas();
        v1.seComen();
    }
}
