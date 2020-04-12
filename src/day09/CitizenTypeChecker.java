package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {
        /*
        task2
        crate a class called CitizenTypeChecker with main method
        cratea variable called citizenType as String
        and create a variable with age with value
        if the age ismore than 65, assign value of citizenType to senior
        if not, assign value of citizenType to non-senior

        Eventually print out ( the ictizen age is <number>, he is <senior> )

         */
        String citizenType;

        int age=60;

        if(age> 65){
            citizenType= "Senior";
        }else{
            citizenType="not senior";
        }

        System.out.println(" the citizen age is " + age + ", and he is a " + citizenType);
    }
}
