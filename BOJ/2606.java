import java.io.*;
import java.util.*;

public class Main {
    static int cnt;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        cnt = 0;

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

        visited[1] = true;
        bfs(1);

        System.out.println(cnt);
    }

    static void bfs (int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 0; i < graph[now].size(); i++) {
                int to = graph[now].get(i);
                if (visited[to]) continue;
                visited[to] = true;
                cnt++;
                queue.add(to);
            }
        }
    }
}