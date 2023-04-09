import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r, max;
    static int[] items, dist;
    static ArrayList<Node>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        max = 0;

        items = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            items[i] = Integer.parseInt(st.nextToken());
        }

        graph = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            graph[a].add(new Node(b, l));
            graph[b].add(new Node(a, l));
        }

        for (int i = 1; i < n + 1; i++) {
            max = Math.max(dijkstra(i), max);
        }

        System.out.println(max);
    }

    static int dijkstra(int start) {
        Queue<Node> q = new LinkedList<>();
        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[start] = 0;
        q.add(new Node(start, 0));

        while (!q.isEmpty()) {
            Node now = q.poll();

            for (int i = 0; i < graph[now.node].size(); i++) {
                Node next = graph[now.node].get(i);

                int nl = next.length + now.length;
                if (dist[next.node] < nl) continue;

                dist[next.node] = nl;
                q.add(new Node(next.node, nl));
            }
        }

        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            if (dist[i] <= m) {
                sum += items[i];
            }
        }

        return sum;
    }

    static class Node {
        int node, length;

        public Node(int node, int length) {
            this.node = node;
            this.length = length;
        }
    }
}