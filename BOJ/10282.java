import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int max = 0;
            int cnt = 0;
            int[] dist = new int[n + 1];

            ArrayList<Node>[] graph = new ArrayList[n + 1];

            for (int i = 0; i < n + 1; i++) {
                graph[i] = new ArrayList<>();
                dist[i] = Integer.MAX_VALUE;
            }

            for (int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());

                graph[b].add(new Node(a, s));
            }

            PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(node -> node.time));
            dist[c] = 0;
            q.add(new Node(c, 0));


            while (!q.isEmpty()) {
                Node now = q.poll();

                for (Node next: graph[now.node]) {
                    if (dist[next.node] <= now.time + next.time) continue;
                    dist[next.node] = now.time + next.time;
                    q.add(new Node(next.node, next.time + now.time));
                }
            }

            for (int i = 0; i < n + 1; i++) {
                if (dist[i] != Integer.MAX_VALUE) {
                    cnt++;
                    max = Math.max(dist[i], max);
                }
            }

            sb.append(cnt).append(" ").append(max).append("\n");
        }

        System.out.println(sb);
    }

    static class Node {
        int node, time;

        public Node(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }
}