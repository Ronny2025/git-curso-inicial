package day12;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        /*
        /  Wake up Task 2
Create a class called WarmUp_SeasonFinder :
Create a variable called month with data type int
And write an if else if else statement to do following
If the month is less than 1 or more than 12 —>> INVALID MONTH
If the month is between 3-5  print it's  spring
If the month is between 6-8  print it's  summer
If the month is between 8-12  print it's  fall
If the month is 12,1,2  print it's  Winter!
Read only
         */


        int month=6;

        if(month>12||month<1){
            System.out.println(" invalid month");
        }else if ( month>3&& month<5){
            System.out.println("Spring");
        }else if( month>=6 &&month<=8){
            System.out.println("It is Summer");
        }else if ( month>8 &&month<12){
            System.out.println(" it is fall");
            //if month 12// true || false || false
        }else  if( month==12|| month==1|| month==2){
            System.out.println(" It is winter");
        }
        //Since first condition is already taking out
        //invalid situation, we do not need else in this code
        //else in general is optional
    }
}
