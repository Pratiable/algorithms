import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        ArrayList<Node>[] graph = new ArrayList[v + 1];
        int[] dist = new int[v + 1];

        for (int i = 0; i < v + 1; i++) {
            dist[i] = Integer.MAX_VALUE;
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[u].add(new Node(r, w));
        }

        dist[k] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.add(new Node(k, 0));

        while(!pq.isEmpty()) {
            Node now = pq.poll();

            for (int i = 0; i < graph[now.node].size(); i++) {
                Node next = graph[now.node].get(i);

                if (dist[next.node] > now.cost + next.cost) {
                    dist[next.node] = now.cost + next.cost;
                    pq.add(new Node(next.node, dist[next.node]));
                }
            }
        }

        for (int i = 1; i < v + 1; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
                continue;
            }
            sb.append(dist[i]).append("\n");
        }

        System.out.println(sb);
    }

    static class Node {
        int node, cost;

        Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }
}