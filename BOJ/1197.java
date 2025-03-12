import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        long sum = 0;
        boolean[] visited = new boolean[v + 1];
        ArrayList<Node>[] graph = new ArrayList[v + 1];

        for (int i = 0; i < v + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[a].add(new Node(b, w));
            graph[b].add(new Node(a, w));
        }

        PriorityQueue<Node> pq = new PriorityQueue<Node>(Comparator.comparingInt(o -> o.w));
        pq.add(new Node(1, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int u = now.u;
            int w = now.w;

            if (visited[u]) continue;
            visited[u] = true;
            sum += w;

            for (Node node: graph[u]) {
                if (!visited[node.u]) {
                    pq.add(node);
                }
            }

        }


        System.out.println(sum);
    }

    public static class Node {
        int u;
        int w;

        public Node(int u, int w) {
            this.u = u;
            this.w = w;
        }
    }
}