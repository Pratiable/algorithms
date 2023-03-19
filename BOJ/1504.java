import java.io.*;
import java.util.*;

public class Main {
    static int n, e;
    static int[] sdist, v1dist, v2dist;
    static ArrayList<Node>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        sdist = new int[n + 1];
        v1dist = new int[n + 1];
        v2dist = new int[n + 1];
        Arrays.fill(sdist, 100_000_000);
        Arrays.fill(v1dist, 100_000_000);
        Arrays.fill(v2dist, 100_000_000);

        graph = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }

        st = new StringTokenizer(br.readLine());

        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        dij(1, sdist);
        dij(v1, v1dist);
        dij(v2, v2dist);

        int result = Math.min(sdist[v1] + v1dist[v2] + v2dist[n], sdist[v2] + v2dist[v1] + v1dist[n]);

        System.out.println(result >= 100_000_000 ? -1 : result);
    }

    static void dij (int start, int[] dist) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            for (Node next: graph[now.node]) {
                if (dist[next.node] <= now.cost + next.cost) continue;
                dist[next.node] = now.cost + next.cost;
                pq.add(new Node(next.node, now.cost + next.cost));
            }
        }
    }

    static class Node implements Comparable<Node>{
        int node, cost;

        Node (int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node node) {
            return this.cost - node.cost;
        }
    }
}