import java.io.*;
import java.util.*;

public class Main {
    static int n, m, x, max;
    static ArrayList<Node>[] graph, reverseGraph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        max = -1;

        graph = new ArrayList[n + 1];
        reverseGraph = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            graph[s].add(new Node(e, t));
            reverseGraph[e].add(new Node(s, t));
        }

        int[] sdist = dijkstra(graph);
        int[] xdist = dijkstra(reverseGraph);

        for (int i = 1; i < n + 1; i++) {
            max = Math.max(max, sdist[i] + xdist[i]);
        }

        System.out.println(max);
    }

    static int[] dijkstra(ArrayList<Node>[] graph) {
        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(n -> n.time));
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[x] = 0;
        q.add(new Node(x, 0));

        while (!q.isEmpty()) {
            Node now = q.poll();

            for (Node next: graph[now.node]) {
                if (dist[next.node] <= now.time + next.time) continue;
                dist[next.node] = now.time + next.time;
                q.add(new Node(next.node, dist[next.node]));
            }
        }

        return dist;
    }

    static class Node {
        int node, time;

        public Node(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }
}