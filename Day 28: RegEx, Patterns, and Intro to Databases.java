import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Pattern p = Pattern.compile(".+@gmail\\.com");
        Matcher m;
        List<String> name = new ArrayList();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();

            m = p.matcher(emailID);
            if (m.matches()) {
                name.add(firstName);
            }
        }

        Collections.sort(name);
        for(String fname: name){
            System.out.println(fname);
        }
    }
}
