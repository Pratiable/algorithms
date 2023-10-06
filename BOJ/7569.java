import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[] dh = {1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[][][] map = new int[h][m][n];
        boolean[][][] visited = new boolean[h][m][n];
        Queue<Tomato> q = new LinkedList<>();
        int max = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    int now = Integer.parseInt(st.nextToken());
                    map[i][j][k] = now;
                    if (now == -1 || now == 1) visited[i][j][k] = true;
                    if (now == 1) q.add(new Tomato(j, k, i, 0));
                }
            }
        }

        while (!q.isEmpty()) {
            Tomato now = q.poll();

            if (now.day > max) max = now.day;

            for (int i = 0; i < 2; i++) {
                int nz = now.z + dh[i];
                if (nz < 0 || nz >= h || visited[nz][now.x][now.y]) continue;
                visited[nz][now.x][now.y] = true;
                map[nz][now.x][now.y] = 1;
                q.add(new Tomato(now.x, now.y, nz, now.day + 1));
            }

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                if (visited[now.z][nx][ny]) continue;
                visited[now.z][nx][ny] = true;
                map[now.z][nx][ny] = 1;
                q.add(new Tomato(nx, ny, now.z, now.day + 1));
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (map[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        System.out.println(max);
    }

    static class Tomato {
        int x, y, z, day;

        public Tomato(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }
}
