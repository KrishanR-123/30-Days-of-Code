import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = n;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
