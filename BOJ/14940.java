import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int[][] move = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int sx = 0, sy = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Arrays.fill(move[i], -1);
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 0) move[i][j] = 0;
                if (map[i][j] == 2) {
                    sx = i;
                    sy = j;
                }
            }
        }
        Queue<Coord> queue = new LinkedList<>();
        visited[sx][sy] = true;
        move[sx][sy] = 0;
        queue.add(new Coord(sx, sy, 0));

        while (!queue.isEmpty()) {
            Coord now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] || map[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                move[nx][ny] = now.cnt + 1;
                queue.add(new Coord(nx, ny, now.cnt + 1));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(move[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static class Coord {
        int x, y, cnt;

        public Coord(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
