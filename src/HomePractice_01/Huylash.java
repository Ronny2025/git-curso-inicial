package HomePractice_01;

public class Huylash extends FolklorPeruano {

    @Override
    public void baile() {
        System.out.println("Huaylash se salta y zapatea");
    }

    public static void main(String[] args) {
        Huylash b1 = new Huylash();
        b1.baile();
    }
}
