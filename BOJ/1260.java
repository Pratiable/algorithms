import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 0; i < N + 1; i++) {
            Collections.sort(graph[i]);
        }
        visited[V] = true;
        dfs(V);
        sb.append("\n");

        Queue<Integer> queue = new LinkedList<>();
        visited = new boolean[N + 1];
        visited[V] = true;
        queue.add(V);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            sb.append(node).append(" ");
            for (int i = 0; i < graph[node].size(); i++) {
                int next = graph[node].get(i);
                if (visited[next]) continue;
                visited[next] = true;
                queue.add(next);
            }
        }

        System.out.println(sb);
    }

    static void dfs(int node) {
        sb.append(node).append(" ");

        for (int i = 0; i < graph[node].size(); i++) {
            int next = graph[node].get(i);
            if (visited[next]) continue;
            visited[next] = true;
            dfs(next);
        }
    }
}