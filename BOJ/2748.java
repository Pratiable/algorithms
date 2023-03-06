import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] fib = new long[91];

        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        for (int i = 3; i < 91; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        int n = Integer.parseInt(br.readLine());

        System.out.println(fib[n]);
    }
}