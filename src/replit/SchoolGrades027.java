package replit;
import java.util.Scanner;
public class SchoolGrades027 {
    /*Write the program that will calculate average grade.
Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;

-Create a Scanner object named scan.

     */
    public static void main(String[] args) {

        String subject1,subject2, subject3, subject4, subject5, summary;
        double grade1,  grade2, grade3, grade4, grade5,average;
        Scanner Scan=new Scanner(System.in);


       System.out.println("Welcome to Grader!");
        System.out.println( "Please enter subject name number 1 and score for this subject");
        subject1 = Scan.next();
        grade1=Scan.nextDouble();


        System.out.println( "Please enter subject name number 2 and score for this subject");
        subject2 = Scan.next();
        grade2=Scan.nextDouble();

        System.out.println( "Please enter subject name number 3 and score for this subject");
        subject3 = Scan.next();
        grade3=Scan.nextDouble();

       System.out.println( "Please enter subject name number 4 and score for this subject");
        subject4 = Scan.next();
        grade4=Scan.nextDouble();

        System.out.println( "Please enter subject name number 5 and score for this subject");
        subject5 = Scan.next();
        grade5=Scan.nextDouble();
        average=(grade1 +grade2 +grade3 +grade4 +grade5 )/5;

        System.out.println("Summary: " +subject1+" - "+grade1+ ", " +subject2+" - "+grade2+ ", "
                +subject3+" - "+grade3+ ", " +subject4+" - "+grade4+ ", " +subject5+" - "+grade5 );

        System.out.println("Your average score is: " + average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");


    }
}
