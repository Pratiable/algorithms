import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        boolean[] visited = new boolean[n + 1];
        ArrayList<Integer> arrived = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, 0});
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            if (now[1] > k) continue;

            if (now[1] == k) {
                arrived.add(now[0]);
                continue;
            }

            for (int i = 0; i < graph[now[0]].size(); i++) {
                int next = graph[now[0]].get(i);

                if (visited[next]) continue;
                visited[next] = true;
                queue.add(new int[]{next, now[1] + 1});
            }
        }

        Collections.sort(arrived);

        if (arrived.size() == 0) {
            System.out.println(-1);
            return;
        }

        for (int ar: arrived) {
            sb.append(ar).append("\n");
        }

        System.out.println(sb);
    }
}