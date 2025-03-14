import java.io.*;
import java.util.*;

class Main {
    static int n, m, max, maxIdx;
    static int[][] dist;
    static ArrayList<Vertex>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] nums = new int[3];
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        m = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];
        max = Integer.MIN_VALUE;

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new Vertex(b, c));
            graph[b].add(new Vertex(a, c));
        }

        dist = new int[3][n + 1];

        for (int k = 0; k < 3; k++) {
            int now = nums[k];
            Arrays.fill(dist[k], Integer.MAX_VALUE);
            dist[k][now] = 0;
            dij(now, k);
        }

        for (int i = 1; i < n + 1; i++) {
            int minDist = Math.min(dist[0][i], Math.min(dist[1][i], dist[2][i]));
            if (max < minDist) {
                max = minDist;
                maxIdx = i;
            }
        }

        System.out.println(maxIdx);
    }

    static void dij(int start, int idx) {
        PriorityQueue<Vertex> pq = new PriorityQueue<>(((o1, o2) -> o1.w - o2.w));
        pq.offer(new Vertex(start, 0));
        while (!pq.isEmpty()) {
            Vertex now = pq.poll();
            for (Vertex next : graph[now.to]) {
                if (dist[idx][next.to] > dist[idx][now.to] + next.w) {
                    dist[idx][next.to] = dist[idx][now.to] + next.w;
                    pq.add(new Vertex(next.to, dist[idx][next.to]));
                }
            }
        }
    }

    static class Vertex {
        int to, w;

        public Vertex(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }
}
