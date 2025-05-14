import java.io.*;
import java.util.*;

public class Main {
    static int n, m, max;
    static int[][] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph = new int[n + 1][n + 1];
        max = -1;
        visited = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(graph[i], Integer.MIN_VALUE);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            graph[from][to] = Math.max(dist, graph[from][to]);
        }

        dfs(0, 0, 0);

        System.out.println(max);
    }

    static void dfs(int depth, int idx, int dist) {
        if (depth == n) {
            if (graph[idx][0] != Integer.MIN_VALUE) max = Math.max(dist + graph[idx][0], max);
            return;
        }

        for (int i = 1; i < n + 1; i++) {
            if (visited[i] || graph[idx][i] == Integer.MIN_VALUE) continue;
            visited[i] = true;
            dfs(depth + 1, i, dist + graph[idx][i]);
            visited[i] = false;
        }
    }
}