import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-2, -2, 0, 0, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -1, 1};
    static int ex, ey;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(map[i], Integer.MAX_VALUE);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken());
        int sy = Integer.parseInt(st.nextToken());
        ex = Integer.parseInt(st.nextToken());
        ey = Integer.parseInt(st.nextToken());

        Queue<Move> q = new LinkedList<>();
        q.add(new Move(sx, sy, 0));

        while (!q.isEmpty()) {
            Move now = q.poll();
            if (now.x == ex && now.y == ey) {
                map[ex][ey] = Math.min(map[ex][ey], now.step);
                continue;
            }

            for (int i = 0; i < 6; i++) {
                int nx = dx[i] + now.x;
                int ny = dy[i] + now.y;

                if (nx >= n || ny >= n || nx < 0 || ny < 0) continue;
                if (map[nx][ny] <= now.step + 1) continue;
                map[nx][ny] = now.step + 1;
                q.add(new Move(nx, ny, now.step + 1));
            }
        }

        System.out.println(map[ex][ey] == Integer.MAX_VALUE ? -1 : map[ex][ey]);
    }

    static class Move {
        int x, y, step;

        public Move(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }
}