import java.util.Scanner;

public class Solution {

    public static int bitwiseAnd(int n, int k) {
        int res = 0;

        for (int i = 1; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if ((i & j) < k)
                    res = Math.max(res, i & j);

        return res;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

