import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] fib = new long[1_000_001];

        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 2;

        for (int i = 3; i < n + 1; i++) {
            fib[i] = (fib[i - 1] % 15746 + fib[i - 2] % 15746) % 15746;
        }


        System.out.println(fib[n]);
    }
}