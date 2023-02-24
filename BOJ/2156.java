import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] wines = new int[n + 1];
        int[] d = new int [n + 1];
        for (int i = 1; i < n + 1; i++) {
            wines[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(wines[1]);
            return;
        }

        if (n == 2) {
            System.out.println(wines[1] + wines[2]);
            return;
        }

        d[1] = wines[1];
        d[2] = wines[1] + wines[2];
        d[3] = Math.max(d[2], Math.max(wines[1] + wines[3], wines[2] + wines[3]));

        for (int i = 4; i < n + 1; i++) {
            d[i] = Math.max(Math.max(d[i - 3] + wines[i - 1] + wines[i], d[i - 2] + wines[i]), d[i - 1]);
        }

        System.out.println(d[n]);
    }
}