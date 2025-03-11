import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        Visited[][] steps = new Visited[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                steps[i][j] = new Visited(Integer.MAX_VALUE, false);
            }
        }

        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(0, 0, 1, false));

        while (!q.isEmpty()) {
            Coordinate now = q.poll();
            int x = now.x;
            int y = now.y;
            int cnt = now.cnt;
            boolean isBroke = now.isBroke;
            if (x == n - 1 && y == m - 1) {
                min = Math.min(min, cnt);
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= n || ny >= m || nx < 0 || ny < 0) continue;
                if (steps[nx][ny].cnt <= cnt + 1) {
                    if (steps[nx][ny].isBroke && !isBroke && map[nx][ny] == 0) {
                        steps[nx][ny].cnt = cnt + 1;
                        steps[nx][ny].isBroke = false;
                        q.add(new Coordinate(nx, ny, cnt + 1, false));
                    }
                    continue;
                }

                if (map[nx][ny] == 1 && isBroke) continue;
                if (map[nx][ny] == 1 && !isBroke) {
                    steps[nx][ny].cnt = cnt + 1;
                    steps[nx][ny].isBroke = true;
                    q.add(new Coordinate(nx, ny, cnt + 1, true));
                } else {
                    steps[nx][ny].cnt = cnt + 1;
                    steps[nx][ny].isBroke = isBroke;
                    q.add(new Coordinate(nx, ny, cnt + 1, isBroke));
                }
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    static class Coordinate {
        int x, y, cnt;
        boolean isBroke;

        public Coordinate(int x, int y, int cnt, boolean isBroke) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.isBroke = isBroke;
        }
    }

    static class Visited {
        int cnt;
        boolean isBroke;

        public Visited(int cnt, boolean isBroke) {
            this.cnt = cnt;
            this.isBroke = isBroke;
        }
    }
}
