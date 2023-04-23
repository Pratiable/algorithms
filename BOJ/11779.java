import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] dist = new int[n + 1];
        int[] prev = new int[n + 1];
        Stack<Integer> stack = new Stack<>();

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
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(node -> node.time));
        dist[start] = 0;
        q.add(new Node(start, 0));

        while (!q.isEmpty()) {
            Node now = q.poll();

            if (dist[now.node] < now.time) continue;

            for (Node next: graph[now.node]) {
                if (dist[next.node] <= now.time + next.time) continue;
                dist[next.node] = now.time + next.time;
                prev[next.node] = now.node;
                q.add(new Node(next.node, next.time + now.time));
            }
        }

        stack.add(end);

        int now = end;
        while (true) {
            stack.add(prev[now]);
            now = prev[now];
            if (now == start) break;
        }

        sb.append(dist[end]).append("\n");
        sb.append(stack.size()).append("\n");
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
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