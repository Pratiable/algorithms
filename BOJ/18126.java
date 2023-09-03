import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Road>[] roads;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        roads = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            roads[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            long length = Long.parseLong(st.nextToken());

            roads[from].add(new Road(from, to, length));
            roads[to].add(new Road(to, from, length));
        }

        Queue<Road> queue = new LinkedList<>();
        queue.add(new Road(1, 0, 0));

        while (!queue.isEmpty()) {
            Road now = queue.poll();
            visited[now.from] = true;
            sum = Math.max(sum, now.length);

            for (Road next : roads[now.from]) {
                if (!visited[next.to]) {
                    queue.add(new Road(next.to, 0, next.length + now.length));
                }
            }
        }

        System.out.println(sum);
    }

    static class Road {
        int from, to;
        long length;

        public Road(int from, int to, long length) {
            this.from = from;
            this.to = to;
            this.length = length;
        }
    }
}