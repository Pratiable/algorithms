import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int[][] dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Coordinate> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c.cost));
        pq.add(new Coordinate(0, 0, 0));
        dist[0][0] = 0;

        while (!pq.isEmpty()) {
            Coordinate now = pq.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (dist[nx][ny] <= now.cost + map[nx][ny]) continue;
                dist[nx][ny] = now.cost + map[nx][ny];
                pq.add(new Coordinate(nx, ny, dist[nx][ny]));
            }
        }

        System.out.println(dist[n - 1][m - 1]);
    }

    static class Coordinate {
        int x, y, cost;

        public Coordinate(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
}
