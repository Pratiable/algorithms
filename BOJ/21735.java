import java.io.*;
import java.util.*;

public class Main {
    static int n, m, max;
    static int[] snows;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        max = 0;
        snows = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            snows[i] = Integer.parseInt(st.nextToken());
        }
        make(0, 0, 1);
        System.out.println(max);
    }

    static void make(int depth, int idx, int size) {
        if (idx == n || depth == m) {
            max = Math.max(size, max);
            return;
        }
        if (idx < n - 1) make(depth + 1, idx + 2, (size / 2) + snows[idx + 2]);

        if (idx < n) make(depth + 1, idx + 1, size + snows[idx + 1]);
    }
}