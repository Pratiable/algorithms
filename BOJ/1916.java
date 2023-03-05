import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] costs = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        ArrayList<ArrayList<Point>> graph = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Point>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(s).add(new Point(e, c));
        }

        for (int i = 0; i < n + 1; i++) {
            costs[i] = Integer.MAX_VALUE;
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        costs[start] = 0;

        PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.add(new Point(start, 0));

        while (!pq.isEmpty()) {
            Point now = pq.poll();

            if (costs[now.node] < now.cost) continue;
            if (visited[now.node]) continue;
            visited[now.node] = true;

            for (int i = 0; i < graph.get(now.node).size(); i++) {
                Point next = graph.get(now.node).get(i);

                if (!visited[next.node] && costs[next.node] > now.cost + next.cost) {
                    costs[next.node] = now.cost + next.cost;
                    pq.add(new Point(next.node, costs[next.node]));
                }
            }
        }

        System.out.println(costs[end]);
    }

    static class Point {
        int node, cost;

        Point (int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }
}