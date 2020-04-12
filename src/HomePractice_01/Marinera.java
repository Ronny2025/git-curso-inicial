package HomePractice_01;

public class Marinera extends FolklorPeruano {

    @Override
    public void baile() {
        System.out.println(" Marinera se danza con caballo");
    }

    public static void main(String[] args) {
        Marinera b2=new Marinera();
        b2.baile();
    }
}
