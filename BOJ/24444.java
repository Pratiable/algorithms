import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r, cnt;
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        cnt = 1;

        visited = new int[n + 1];
        graph = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 0; i < n + 1; i++) {
            Collections.sort(graph[i]);
        }
        Queue<Integer> queue = new LinkedList<>();
        visited[r] = cnt++;
        queue.add(r);

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = 0; i < graph[now].size(); i++) {
                int next = graph[now].get(i);
                if (visited[next] != 0) continue;
                visited[next] = cnt++;
                queue.add(next);
            }
        }

        for (int i = 1; i < n + 1; i++) {
            sb.append(visited[i]).append("\n");
        }

        System.out.println(sb);
    }
}
