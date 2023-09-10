import java.io.*;
import java.util.*;

class Main {
    static int n, s, m, max;
    static int[] v;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        v = new int[n + 1];
        max = -1;
        visited = new boolean[n + 1][m + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }

        f(1, s);

        System.out.println(max);
    }

    static void f(int i, int vol) {
        if (i == n + 1) {
            max = Math.max(max, vol);
            return;
        }

        if (vol + v[i] <= m) {
            if (!visited[i][vol + v[i]]) {
                visited[i][vol + v[i]] = true;
                f(i + 1, vol + v[i]);
            }
        }
        if (vol - v[i] >= 0) {
            if (!visited[i][vol - v[i]]) {
                visited[i][vol - v[i]] = true;
                f(i + 1, vol - v[i]);
            }
        }
    }
}
