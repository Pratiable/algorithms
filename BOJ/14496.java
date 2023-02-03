import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        boolean[] visited = new boolean[n + 1];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m ; i++) {
            st= new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, 0});
        visited[a] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            if (now[0] == b) {
                min = Math.min(now[1], min);
                continue;
            }

            for (int i = 0; i < graph[now[0]].size(); i++) {
                int next = graph[now[0]].get(i);
                if (visited[next]) continue;
                visited[next] = true;
                queue.add(new int[]{next, now[1] + 1});
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}