import java.io.*;
import java.util.*;

public class Main {
    static int[][] map, copiedMap;
    static boolean[][] visited;
    static int n, m, min;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static Queue<Coord> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;
        map = new int[n][n];
        copiedMap = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int now = Integer.parseInt(st.nextToken());
                map[i][j] = now == 1 ? -5 : now == 0 ? -1 : -2;
            }
        }

        dfs(0, 0);
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    static void dfs(int depth, int idx) {
        if (depth == m) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(visited[i], false);
            }
            for (int i = 0; i < n; i++) {
                copiedMap[i] = Arrays.copyOf(map[i], n);
            }

            queue.clear();
            int maxTime = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (copiedMap[i][j] == 0) {
                        queue.add(new Coord(i, j, 0));
                        visited[i][j] = true;
                    }
                }
            }

            while (!queue.isEmpty()) {
                Coord now = queue.poll();
                if (maxTime < now.time) {
                    if (checkInfectedAll()) {
                        min = Math.min(now.time, min);
                        break;
                    }
                    maxTime = now.time;
                }
                copiedMap[now.x][now.y] = now.time;

                for (int k = 0; k < 4; k++) {
                    int nx = now.x + dx[k];
                    int ny = now.y + dy[k];

                    if (nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny] || copiedMap[nx][ny] == -5) continue;
                    visited[nx][ny] = true;
                    queue.add(new Coord(nx, ny, now.time + 1));
                }
            }

            if (checkInfectedAll() && min > maxTime) min = maxTime;
            return;
        }

        for (int cur = idx; cur < n * n; cur++) {
            int x = cur / n;
            int y = cur % n;
            if (map[x][y] != -2) continue;
            map[x][y] = 0;
            dfs(depth + 1, cur + 1);
            map[x][y] = -2;
        }
    }

    static boolean checkInfectedAll() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (copiedMap[i][j] == -1) return false;
            }
        }

        return true;
    }

    static class Coord {
        int x, y, time;

        public Coord(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
}
