import java.io.*;
import java.util.*;

public class Main {
    static int n, m, ans;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ans = Integer.MAX_VALUE;
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < m; i++) {
            solve(0, i, -1, map[0][i]);
        }

        System.out.println(ans);
    }

    static void solve(int x, int y, int dist, int cur) {
        if (x == n - 1) {
            ans = Math.min(ans, cur);
            return;
        }

        if (dist != 0) {
            if (y - 1 >= 0) solve(x + 1, y - 1, 0, cur + map[x + 1][y - 1]);
        }

        if (dist != 1) {
            solve(x + 1, y, 1, cur + map[x + 1][y]);
        }

        if (dist != 2) {
            if (y + 1 < m) solve(x + 1, y + 1, 2, cur + map[x + 1][y + 1]);
        }
    }
}