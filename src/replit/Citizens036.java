package replit;

import java.util.Scanner;

public class Citizens036 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int seniorCitizens, nonSeniorCitizens,age;
        seniorCitizens=5;
        nonSeniorCitizens=4;

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        System.out.println("What is new citizen's age?");
        age=scan.nextInt();
        if(age>=65){
            System.out.println("Senior Citizen");
            seniorCitizens=seniorCitizens+1;
        }else if(age<65){
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens=nonSeniorCitizens+1;
        }

        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
    }
}
