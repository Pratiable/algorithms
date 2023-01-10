import java.io.*;
import java.util.*;

public class Main {
    static int N, min;
    static int[][] map;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        min = Integer.MAX_VALUE;
        map = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < N; k++) {
        	visited[k] = true;
            dfs(k, 0, k, 0);
            visited[k] = false;
        }
        System.out.println(min);
    }

    static void dfs(int start, int depth, int pos, int cost) {
        if (depth == N - 1) {
            if (map[pos][start] != 0) {
                min = Math.min(min, cost + map[pos][start]);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] || map[pos][i] == 0) continue;
            visited[i] = true;
            dfs(start, depth + 1, i, cost + map[pos][i]);
            visited[i] = false;
        }
    }
}