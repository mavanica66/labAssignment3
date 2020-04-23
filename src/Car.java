import java.io.IOException;
import java.util.Scanner;
import java.lang.Throwable;

/*
  Marco Vargas
  CSC-162
  Prof: Vickram Sawh
  Lab Assignment 3
  Date: 4/22/2020

 */
public class Car {                                              // Phase 1: Create a class named Car

    // Attributes:
    private int year;                                           // The year attribute is an integer.
    private double price;                                       // The price attribute is a double value.

    // Symbolic constants:
    private final int MINYEAR = 1970;                           // Minimum year is 1970
    private final double MINPRICE = 0.00;                       // Minimum price is 0.00


    // setter/getter methods: setYear()
    public void setYear(int Y) throws CarException {            // Phase 4: setYear will create a Throw
        if (Y >= MINYEAR && Y <= 2011)
            year = Y;
        else
            throw new CarException("Invalid Year");
    }

    public int getYear() {                                      // setter/getter methods: getYear()
        return year;
    }

    public void setPrice(double P) throws CarException{         // setter/getter methods: setPrice()
        if (P >= MINPRICE && P <= 100000)
            price = P;
        else
            throw new CarException("Invalid Price.");
    }
    public double getPrice(){                                   // setter/getter methods: getPrice()
        return price;
    }

    // Phase 2: Default, overloaded, & Copy Constructors
    public Car(){                                               // Default constructor which sets
        year = 2001;                                            // the year and price attributes
        price = 15000;
    }

    // Overloaded Constructor passing 2 parameters
    public Car(int Y, double P ) throws CarException {          // Phase 4: Added throws CarException
        setYear (Y);
        setPrice (P);
    }

    // COPY CONSTRUCTOR
    public Car(Car c){
        this.year = c.year;
        this.price = c.price;
    }

/*
     Phase 4:
     Override the toString() inherited from the class Object.
     It helps the compiler convert a Car object into a string.
*/

    public String toString(){                                           // Phase 4: Override toString()

        // Return Output: DISABLE
        // return "\nThe Car year is " + year + " and the price is "     // Works with CodeTester.java
        //        + price + ".";

        // Return Output: ENABLE

            return "[ Year : " + year + " , Price : " + ( int )price + " ]";

    }



    // Phase 5: releases resources tied to the object BEFORE the Garbage Collectors removes it.
    protected void finalize() throws Throwable{                         // Finalized() method: does nothing
        super.finalize ();                                              // other than print statement
        System.out.println("The finalize method called.\n");
    }

}   // End of Car Class

