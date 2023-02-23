import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] p = new long[1001];
        p[1] = 1;
        p[2] = 2;
        p[3] = 3;
        p[4] = 5;
        for (int i = 5; i < 1001; i++) {
            p[i] = (p[i - 1] + p[i - 2]) % 10_007;
        }

        System.out.println(p[n]);
    }
}