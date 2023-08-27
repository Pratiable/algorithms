import java.io.*;
import java.util.*;

public class Main {
    static int n, m, max, startFactory, endFactory;
    static ArrayList<Bridge>[] bridges;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        max = 0;
        bridges = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            bridges[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            bridges[a].add(new Bridge(b, c));
            bridges[b].add(new Bridge(a, c));
        }

        st = new StringTokenizer(br.readLine());

        startFactory = Integer.parseInt(st.nextToken());
        endFactory = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 1_000_000_000;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (bfs(mid)) {
                start = mid + 1;
                max = Math.max(max, mid);
            } else {
                end = mid - 1;
            }
        }

        System.out.println(max);
    }

    static boolean bfs (int weight) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        visited[startFactory] = true;

        q.add(startFactory);

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == endFactory) {
                return true;
            }

            for (Bridge next : bridges[now]) {
                if (visited[next.to] || next.weight < weight) continue;
                visited[next.to] = true;
                q.add(next.to);
            }
        }

        return false;
    }

    static class Bridge {
        int to;
        int weight;

        public Bridge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}