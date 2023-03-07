import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] fib = new long[46][2];

        fib[1][0] = 0;
        fib[1][1] = 1;

        for (int i = 2; i < n + 1; i++) {
            fib[i][0] = fib[i - 1][1];
            fib[i][1] = fib[i - 1][0] + fib[i - 1][1];
        }

        System.out.printf("%d %d", fib[n][0], fib[n][1]);
    }
}