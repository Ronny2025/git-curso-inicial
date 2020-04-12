package HomePractice_01;
import java.util.Scanner;
public class SwitchStatementAndScanner {
    public static void main(String[] args) {
        Scanner ronny = new Scanner(System.in);


        int numero1, numero2;
        String name;
        System.out.println(" Por favor ingrese su nombre:");
        name= ronny.next();
        System.out.println(" Buenos dias " + name + ", que gusto que hayas regresado!!");
        System.out.println(" Por favor " + name + " entre 2 numeros :");
        numero1= ronny.nextInt();
        numero2=ronny.nextInt();

        char operador= '*';

        switch (operador) {

            case '*':
                System.out.println(numero1 * numero2);
                break;
            case '/':
                System.out.println(numero1 / numero2);
                break;
            case '+':
                System.out.println(numero1 + numero2);
                break;
            case '-':
                System.out.println(numero1 - numero2);
                break;

            default:
                System.out.println(" Operacion invalida");
        }

            }
        }








