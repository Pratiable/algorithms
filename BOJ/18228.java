import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[N + 1];
        int lMin = Integer.MAX_VALUE;
        int rMin = Integer.MAX_VALUE;
        int pIdx = -1;

        for (int i = 1; i <= N; i++) {
            int n = Integer.parseInt(st.nextToken());
            a[i] = n;
            if (n == -1) pIdx = i;
        }

        for (int i = 1; i <= pIdx - 1; i++) {
            lMin = Math.min(lMin, a[i]);
        }

        for (int i = pIdx + 1; i <= N; i++) {
            rMin = Math.min(rMin, a[i]);
        }

        System.out.println(lMin + rMin);
    }
}
