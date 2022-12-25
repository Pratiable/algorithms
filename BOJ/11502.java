import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        boolean[] sieve = new boolean[1001];

        sieve[0] = true;
        sieve[1] = true;

        for (int i = 2; i < Math.sqrt(1000) + 1; i++) {
            if (!sieve[i]) {
                for (int j = i * i; j < 1001; j += i) {
                    sieve[j] = true;
                }
            }
        }
        
        Make:
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            for (int a = 2; a < sieve.length; a++) {
                if (sieve[a]) continue;
                for (int b = a; b < sieve.length; b++) {
                    if (sieve[b]) continue;
                    for (int c = b; c < sieve.length; c++) {
                        if (sieve[c]) continue;
                        if (a + b + c == k) {
                            sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
                            continue Make;
                        }
                    }
                }
            }
            sb.append(0).append("\n");
        }
        System.out.println(sb);
    }
}