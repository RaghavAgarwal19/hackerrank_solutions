import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int la=a.length();
        int lb=b.length();
        int l=la+lb;
        int i,c=0;
        char ch;
        for(i=0;i<la;i++){
            ch=a.charAt(i);
            int ind = b.indexOf(ch);
            if(ind>=0){
                b=b.substring(0,ind) + b.substring(ind+1);
                c++;
            }
        }
        System.out.println(b);
        return (l-2*c);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
