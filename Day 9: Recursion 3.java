import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
            while(in.hasNext())
            {
           long n = in.nextLong();
        long abc=factorial(n);
        System.out.println(abc);
        }    
    }
    
    public static long factorial(long n)
        {
        if(n==0 || n==1)
            {
            return 1;
        }
        else
            return n*factorial(n-1);
    }
}
