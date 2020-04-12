package HomePractice_01;

public class Cumbia extends FolklorPeruano {

    @Override
    public void baile() {
        System.out.println(" Cumbia se baila pegado en pareja");
        //super.baile();
    }

    public static void main(String[] args) {
        Cumbia b3 = new Cumbia();
        b3.baile();
    }
}

