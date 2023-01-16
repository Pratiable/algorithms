import java.io.*;
import java.util.*;

public class Main {
    static int min, a, b, N, M;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        min = Integer.MAX_VALUE;

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        visited[a] = true;
        dfs(0, a);

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    static void dfs (int depth, int node) {
        if (node == b) {
             min = Math.min(depth, min);
        }

        for (int i = 0; i < graph[node].size(); i++) {
            int to = graph[node].get(i);
            if (visited[to]) continue;
            visited[to] = true;
            dfs(depth + 1, to);
            visited[to] = false;
        }

    }
}