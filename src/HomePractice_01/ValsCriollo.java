package HomePractice_01;

public class ValsCriollo extends FolklorPeruano {

    @Override
    public void baile() {
        System.out.println("Vals Criollo se baila tomado de la mano y tocando la cintura");
        // super.baile();
    }

    public static void main(String[] args) {
        ValsCriollo b5 = new ValsCriollo();
        b5.baile();
    }
}
