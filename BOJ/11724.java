import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        boolean[] visited = new boolean[N + 1];
        ArrayList<Integer>[] graph = new ArrayList[N + 1];

        for (int l = 0; l < N + 1; l++) {
            graph[l] = (new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int j = 1; j < N + 1; j++) {
            if (visited[j]) continue;
            queue.add(j);
            visited[j] = true;
            cnt++;

            while (!queue.isEmpty()) {
                int now = queue.poll();

                for (int k = 0; k < graph[now].size(); k++) {
                    int to = graph[now].get(k);
                    if (visited[to]) continue;
                    visited[to] = true;
                    queue.add(to);
                }
            }
        }

        System.out.println(cnt);
    }
}