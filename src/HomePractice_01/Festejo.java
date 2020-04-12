package HomePractice_01;

public class Festejo extends FolklorPeruano {

    @Override
    public void baile() {
        System.out.println("Festejo se danza moviendo las caderas");
        //super.baile();
    }

    public static void main(String[] args) {
        Festejo b4= new Festejo();
        b4.baile();
    }
}
