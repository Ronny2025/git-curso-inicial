package day11;

import java.util.concurrent.BlockingDeque;

public class WarmUp1_LightOnOff {

    public static void main(String[] args) {
        /*
        Create class calledWarmUp1_LightOnOff
Create a variable : targetOption as String and
assign one of below options for example bd.

You  have 4 switches in your home to turn on

Bd=> bedroom
Lr=> Living room
Ki Kitchen
Ha=> Hallway

Use switch statement  to write a program to
print which room light is turned on.
For example if Bd was targetOption
 then print you have turned on bedroom light

         */

       String targetOption="Ki";
        //what can be the data type of the vairable inside switch
        //byte,short,int,char,string

       switch(targetOption){

           case "Bd":
               System.out.println(" You have turned on Bedroom light");
               break;
           case "Lr":
               System.out.println(" You have turned on Living room light");
               break;
           case "Ki":
               System.out.println(" You have turned on Kitchen light");
               break;
           case "Ha":
               System.out.println(" You have turned on Hallway light");
               break;
           default:
               System.out.println(" NO OPTION!!!");




       }
    }
}
