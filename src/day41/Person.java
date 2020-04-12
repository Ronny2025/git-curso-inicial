package day41;

public class Person {

   private String name;
    private int age;
    private long ssn;

    //what if I want to only get the name
    public String getName(){
        return name;
    }

    //what if I want to only change the name
    public void setName(String newName) {
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age=newAge;
    }

    public long getSsn(){
        return ssn;
    }

    public void setSsn(long newSsn){
        ssn=newSsn;
    }

    //write a method to give value to the field
    public void setAll(String newName,int newAge, long newssn){
        //YOU CAN PUT WHATEVER CHECK HERETO MAKE SURE
        // THE DATA IS CORRECT or any other logic
        name = newName;
        age = newAge;
        ssn = newssn;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
