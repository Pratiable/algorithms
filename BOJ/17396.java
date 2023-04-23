import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Node>[] graph = new ArrayList[n];
        boolean[] map = new boolean[n];
        long[] dist = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            map[i] = Objects.equals(st.nextToken(), "0");
        }

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = Long.MAX_VALUE;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            graph[a].add(new Node(b, t));
            graph[b].add(new Node(a, t));
        }

        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingLong(node -> node.time));
        q.add(new Node(0, 0));
        dist[0] = 0;

        while (!q.isEmpty()) {
            Node now = q.poll();

            if (dist[now.node] < now.time) continue;

            for (int i = 0; i < graph[now.node].size(); i++) {
                Node next = graph[now.node].get(i);

                if (!map[next.node] && next.node != n - 1) continue;
                if (dist[next.node] <= now.time + next.time) continue;
                dist[next.node] = now.time + next.time;
                q.add(new Node(next.node, dist[next.node]));
            }
        }

        System.out.println(dist[n - 1] == Long.MAX_VALUE ? -1 : dist[n - 1]);
    }

    static class Node {
        int node;
        long time;

        public Node(int node, long time) {
            this.node = node;
            this.time = time;
        }
    }
}
