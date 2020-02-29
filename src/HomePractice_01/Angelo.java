package HomePractice_01;

public class Angelo extends Ronny {

int grade;

    public Angelo(int age, double height, String occupation, int grade) {
        super(age, height, occupation);
        this.grade = grade;
    }

    public static void main(String[] args) {
        Angelo h1= new Angelo(12,4.6,"student",6);
        System.out.println("h1 =" + h1);
    }

    @Override
    public String toString() {
        return "Angelo{" +
                "age=" + age +
                ", height=" + height +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

