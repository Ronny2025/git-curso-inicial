package HomePractice_01.Animal54;

public abstract class Animal {
    String name;
    public abstract void walk();

}
class gato extends Animal implements FelinoSalvage{
    @Override
    public void walk() {
        System.out.println("Salta");

    }

    @Override
    public void caza() {
        System.out.println("Animales silvestres");
    }


    }
