package day06;

public class CompoundOperator {

    public static void main(String[] args) {

        //assign operator =
        //--> will save the resukt of whatever operation on
        // the right side
        //and assign the result to the left side variable

        int studentOnline = 263;

        studentOnline = studentOnline +5;

        System.out.println("studenOnline = " + studentOnline);

        studentOnline = studentOnline -3;

        System.out.println(studentOnline );

        studentOnline = studentOnline *2;
        System.out.println("the student count doubled " + studentOnline);
        studentOnline= studentOnline /3;
        System.out.println("the student dropped to 1/3 " + studentOnline);
    }
}
