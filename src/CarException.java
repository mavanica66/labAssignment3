import java.io.*;

/*
  Marco Vargas
  CSC-162
  Prof: Vickram Sawh
  Lab Assignment 3
  Date: 4/22/2020

 */

// Phase 4: My own Exception class which inherits the Exception class.
public class CarException extends Exception {

    // Phase 4a: A private String member message, which will store an error message.
    private String message;

    public CarException(String m){                  // Phase 4
        message = m;
    }
    // getMessage that return error message
    public String getMessage(){
        return message;         // error msg that is stored in the member message
    }
    public String toString()
    {
        return message;
    }
}
