import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int[] dist = new int[n + 1];

        ArrayList<Node>[] graph = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }

        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(node -> node.food));
        dist[1] = 0;
        q.add(new Node(1, 0));


        while (!q.isEmpty()) {
            Node now = q.poll();

            for (Node next: graph[now.node]) {
                if (dist[next.node] <= now.food + next.food) continue;
                dist[next.node] = now.food + next.food;
                q.add(new Node(next.node, next.food + now.food));
            }
        }

        System.out.println(dist[n]);
    }

    static class Node {
        int node, food;

        public Node(int node, int food) {
            this.node = node;
            this.food = food;
        }
    }
}