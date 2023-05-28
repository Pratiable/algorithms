import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        final long INF = 100_000_000_000_000_000L;

        ArrayList<Bus> graph = new ArrayList<>(m + 1);
        long[] dist = new long[n + 1];

        Arrays.fill(dist, INF);

        for (long i = 1; i < m + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            graph.add(new Bus(start, end, time));
        }

        dist[1] = 0;

        for (long c = 1; c < n + 1; c++) {
            for (Bus now : graph) {
                if (dist[now.start] == INF) continue;

                if (dist[now.end] > dist[now.start] + now.time) {
                    if (c == n) {
                        System.out.println(-1);
                        return;
                    }
                    dist[now.end] = dist[now.start] + now.time;
                }
            }
        }

        for (int i = 2; i < n + 1; i++) {
            sb.append(dist[i] == INF ? -1 : dist[i]).append("\n");
        }

        System.out.println(sb);
    }

    static class Bus {
        int start, end, time;

        public Bus(int start, int end, int time) {
            this.start = start;
            this.end = end;
            this.time = time;
        }
    }
}
