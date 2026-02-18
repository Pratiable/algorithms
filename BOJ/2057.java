import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long[] factorials = new long[21];

        if (N == 0) {
            System.out.println("NO");
            return;
        }

        factorials[0] = 1;
        for (int i = 1; i <= 20; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        for (int i = 20; i >= 0; i--) {
            if (factorials[i] <= N) {
                N -= factorials[i];
            }
        }

        System.out.println(N == 0 ? "YES" : "NO");
    }
}
