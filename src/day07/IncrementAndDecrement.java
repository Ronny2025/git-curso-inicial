package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int apple = 10;

        System.out.println("original apple is" + apple);
      //  apple = apple+ 1;
      //  apple +=1;
        ++apple;//this is increasing the value by one in shortcut using++
        ++apple;

        System.out.println(apple);

        //apple= apple-1;
        //apple-=1;
        --apple;

        System.out.println( "used -- once the apple is " + apple );

        System.out.println(++apple);

        System.out.println("used ++ to increment and concatenate : " +   (++apple) );



    }
}
