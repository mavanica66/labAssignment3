
import java.util.Scanner;
/*
  Lab Assignment 3
  Date: 4/22/2020

 */

public class CarClient {
    public static void main(String [] args){
        Scanner i = new Scanner ( System.in );
        int val1;
        double val2;

        System.out.print("Enter the year of the car: ");
        val1 = i.nextInt();
        System.out.print ( "Enter the price of the car: " );
        val2 = i.nextDouble();

         // Car x = new Car();                      // **** IGNORE THIS FOR NOW  ****
         // System.out.println("Car x. " + x );

        try                                         // try block
        {
            Car y = new Car(val1, val2);
            Car z = new Car(y);         // Makes a COPY of Car Y

            System.out.print("\nVal1 = " + val1 + "\nVal2 = " + val2 + "\n");    // Print out user input for debugging purpose ONLY.
            if (val1 > 2011) {
                // This try & catch works fine for MAXYEAR limit. SetYear Min/Max year works fine.
                // This was just for learning purpose only and it's NOT NECESSARY.
                System.out.println ( "The years allowed are between 1970 and 2011. Please try again." );
            }  else {
                Car x = new Car(2001, 15000);
                System.out.println ( "Car x is created. Its stats: " + x + "." );
                System.out.println ( "Car y is created. Its stats: " + y + "." );
                System.out.println ( "Car z is created. Its stats: " + z + "." );



                System.out.println("Goodbye from try");

            }
        }
        catch(CarException e)                   // Catch Handler
        {
            System.out.println( e );
        }
        System.out.println("Goodbye from catch");

    }           // end of main
}               // end of class
