import java.io.*;
import java.util.*;

public class Main {
    static int r, c, sx, sy, ex, ey, min;
    static int[] dx, dy;
    static boolean[][] visited, water;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;

        Queue<Coordinate> q = new LinkedList<>();
        visited = new boolean[r][c];
        map = new char[r][c];

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = str.charAt(j);
                switch (str.charAt(j)) {
                    case 'S':
                        sx = i;
                        sy = j;
                        break;
                    case 'D':
                        ex = i;
                        ey = j;
                        break;
                    case '*':
                        visited[i][j] = true;
                        q.add(new Coordinate(i, j, 0, true));
                        break;
                    case 'X':
                        visited[i][j] = true;
                        break;
                }
            }
        }

        q.add(new Coordinate(sx, sy, 0, false));

        while (!q.isEmpty()) {
            Coordinate n = q.poll();

            if (!n.isWater && n.x == ex && n.y == ey) {
                min = Math.min(n.t, min);
                continue;
            }

            if (n.isWater) {
                for (int i = 0; i < 4; i++) {
                    int nx = n.x + dx[i];
                    int ny = n.y + dy[i];
                    if (nx >= r || ny >= c || nx < 0 || ny < 0) continue;
                    if (map[nx][ny] == 'X' || visited[nx][ny] || map[nx][ny] == 'D') continue;
                    visited[nx][ny] = true;
                    q.add(new Coordinate(nx, ny, 0, true));
                }
            } else {
                for (int i = 0; i < 4; i++) {
                    int nx = n.x + dx[i];
                    int ny = n.y + dy[i];
                    if (nx >= r || ny >= c || nx < 0 || ny < 0) continue;
                    if (map[nx][ny] == 'X' || visited[nx][ny]) continue;
                    visited[nx][ny] = true;
                    q.add(new Coordinate(nx, ny, n.t + 1, false));
                }
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? "KAKTUS" : min);
    }

    static class Coordinate {
        int x, y, t;
        boolean isWater;

        public Coordinate(int x, int y, int t, boolean isWater) {
            this.x = x;
            this.y = y;
            this.t = t;
            this.isWater = isWater;
        }
    }
}