package day10;

public class Answer {

    public static void main(String[] args) {
        /*
        create a package day10 and a class called answer with main
        Create a class called Answer with main
        create a variable calles myAnswer as String with value empty
        String
        Create a variable called myNumber as int and assign any value

        if the number can be divided by5 without remainder
        assign myAnswer value to Fizz Number(just a text, no meaning)
        if not assign the value to not a Fizz Number

        Outside il else statement:
        print my number is 20, it is Fizz Number

         */
        String myAnswer=" ";
        int myNumber= 40;

        if (myNumber % 5==0){myAnswer= "Fizz Number";

        }else {
            myAnswer = "Not a Fizz Number";
        }
        System.out.println("print my number is " + myNumber + ",  it is " +myAnswer);

    }
}
