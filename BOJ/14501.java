import java.io.*;
import java.util.*;

public class Main {
    static int max, n;
    static int[] days, earns;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        max = 0;
        days = new int[n];
        earns = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            days[i] = Integer.parseInt(st.nextToken());
            earns[i] = Integer.parseInt(st.nextToken());
        }
        work(0, 0);
        System.out.println(max);
    }

    static void work(int depth, int sum) {
        if (depth == n) {
            max = Math.max(sum, max);
            return;
        }
        boolean isEnd = false;
        for(int j = depth; j < n; j++) {
            if (j + days[j] > n) continue;
            isEnd = true;
            work(j + days[j], sum + earns[j]);
        }
        if (!isEnd) {
            work(n, sum);
        }
    }
}