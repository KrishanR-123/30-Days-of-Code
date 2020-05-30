import java.util.*;

class Printer <T> {

  /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
 public void printArray(T[] array)
    {
        for(T value:array)
        {
            System.out.println(value);
        }
 
    }
  
  
