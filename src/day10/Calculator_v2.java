package day10;
import java.util.Scanner;
public class Calculator_v2 {

    public static void main(String[] args) {

        //declare two number as int num1, num2 and assign values
        // declare and assign value for char variable called operator +-*/
        //according to the operator, print the redult of the operation

        Scanner blablabla= new Scanner (System.in);

        int num1,num2;
        String name;
        System.out.println(" Please enter your name :");
        name=blablabla.nextLine();
        System.out.println(" Good morning " +name+ ", Please enter 2 numbers:");

         num1 = blablabla.nextInt();
         num2 = blablabla.nextInt();

        //System.out.println(" Please choose an operator +,-,/,*");
       // char operator='-';
         char operator ='*';
        switch(operator)  {

            case'+':
                System.out.println(num1 + num2);
                break;
            case'-':
                System.out.println(num1 - num2);
                break;
            case'*':
                System.out.println(num1 * num2);
                break;
            case'/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("INVALID OPERATOR!!!!");
        }

    }
}
