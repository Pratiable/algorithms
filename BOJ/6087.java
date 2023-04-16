import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        char[][] map = new char[h][w];
        int[][] mirrors = new int[h][w];
        boolean[][][] visited = new boolean[h][w][4];
        int min = Integer.MAX_VALUE;
        int sx = -1;
        int sy = -1;
        int ex = -1;
        int ey = -1;

        for (int i = 0; i < h; i++) {
            String str = br.readLine();
            for (int j = 0; j < w; j++) {
                map[i][j] = str.charAt(j);
                mirrors[i][j] = Integer.MAX_VALUE;
                if (map[i][j] == 'C') {
                    if (sx == -1) {
                        sx = i;
                        sy = j;
                        continue;
                    }
                    ex = i;
                    ey = j;
                }
            }
        }

        Queue<Coordinate> q = new LinkedList<>();
        mirrors[sx][sy] = 0;
        visited[sx][sy][0] = visited[sx][sy][1] = visited[sx][sy][2] = visited[sx][sy][3] = true;
        q.add(new Coordinate(sx, sy, -1, 0));

        while (!q.isEmpty()) {
            Coordinate now = q.poll();
            if (now.x == ex && now.y == ey) {
                min = Math.min(min, mirrors[ex][ey]);
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                if (map[nx][ny] == '*') continue;

                int nc = now.dir != i && now.dir != -1 ? now.cnt + 1 : now.cnt;
                if (visited[nx][ny][i] && nc >= mirrors[nx][ny]) continue;
                visited[nx][ny][i] = true;
                mirrors[nx][ny] = nc;
                q.add(new Coordinate(nx, ny, i, nc));
            }
        }

        System.out.println(min);
    }

    static class Coordinate {
        int x;
        int y;
        int dir;
        int cnt;

        public Coordinate(int x, int y, int dir, int cnt) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cnt = cnt;
        }

    }
}
