package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    //  inside instance method we can directly access instance variable
    public void displayInformation() {

        System.out.println("Location = " + location + " | " +
                           "Company = " + company + " | " +
                           "Salary = " + salary + " $ | " +
                           "isFullTime = " + isFullTime);
    }

    // Write a method called turnToFullTime
    public void turnToFullTime() {

        if (isFullTime == false) {
            isFullTime = true;
        } else {
            System.out.println("ALRADY FULLTIME");
        }
    }

    //write a method to change the location of the Offer
    //to the location user passed
    public void changeLocation(String newLocation) {

        location = newLocation;

    }

    //write a method to accept 4 parameters to change all info
    //about offers
    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFulltime) {

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFulltime;
        //an instance method can call another instance method
        //an instance method can use any instance field
        //since  we already have functionality to display information
        //we called it here to display new information after modifying
        displayInformation();
    }

    //write a method to check the od=ffer belong to 100k club

    public boolean is100kOffer() {
        //salary>= 100000 already generate a bollean result
        //so we can directly return that result

        return salary>100000;
    }
    /**
     * create an instance method called toString
     * has not parameter
     * return String representation of Offer  Object
     * [Location= Virginia, Company = Amazon | Salary = 150000 $ | isFullTime = true]
     */

    public String toString(){
        String str = "[ Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime + " ]";
        return str;


    }
}

