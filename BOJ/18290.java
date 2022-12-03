import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n, m, k, max;
    static int[][] map, visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        max = Integer.MIN_VALUE;
        map = new int[n][m];
        visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        get(0, 0);
        System.out.println(max);
    }

    static void get(int depth, int sum) {
        if (depth == k) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] != 0) continue;
                visited[i][j]++;
                if (i < n - 1) visited[i + 1][j]++;
                if (j < m - 1) visited[i][j + 1]++;
                if (i > 0) visited[i - 1][j]++;
                if (j > 0) visited[i][j - 1]++;
                get(depth + 1, sum + map[i][j]);
                visited[i][j]--;
                if (i < n - 1) visited[i + 1][j]--;
                if (j < m - 1) visited[i][j + 1]--;
                if (i > 0) visited[i - 1][j]--;
                if (j > 0) visited[i][j - 1]--;
            }
        }
    }
}