import java.io.*;
import java.util.*;

class Main {
    static int n, m, d, max;
    static boolean[][] map, curMap, visited;
    static Queue<Coord> queue, dead;
    static int[] dx = {0, -1, 0};
    static int[] dy = {-1, 0, 1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();
        dead = new LinkedList<>();
        map = new boolean[n + 1][m];
        curMap = new boolean[n + 1][m];
        visited = new boolean[n + 1][m];
        Arrays.fill(visited[n], true);
        max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = "1".equals(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(max);
    }

    static class Coord {
        int x;
        int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void dfs(int depth, int idx) {
        if (depth == 3) {
            for (int i = 0; i < n + 1; i++) {
                System.arraycopy(map[i], 0, curMap[i], 0, map[i].length);
            }
            int kill = 0;

            for (int l = 0; l < n; l++) {
                for (int i = 0; i < m; i++) {
                    if (!curMap[n][i]) continue;
                    queue.clear();
                    queue.add(new Coord(n, i));
                    for (int k = 0; k < n; k++) {
                        Arrays.fill(visited[k], false);
                    }

                    Loop:
                    while (!queue.isEmpty()) {
                        Coord now = queue.poll();
                        for (int k = 0; k < 3; k++) {
                            int nx = now.x + dx[k];
                            int ny = now.y + dy[k];
                            if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny]) continue;
                            int range = Math.abs(nx - n) + Math.abs(ny - i);
                            if (range > d) continue;
                            if (curMap[nx][ny]) {
                                dead.add(new Coord(nx, ny));
                                break Loop;
                            }
                            visited[nx][ny] = true;
                            queue.add(new Coord(nx, ny));
                        }
                    }
                }

                while (!dead.isEmpty()) {
                    Coord now = dead.poll();
                    if (curMap[now.x][now.y]) {
                        curMap[now.x][now.y] = false;
                        kill++;
                    }
                }

                for (int i = n - 1; i > 0; i--) {
                    curMap[i] = curMap[i - 1].clone();
                }
                Arrays.fill(curMap[0], false);
            }

            max = Math.max(max, kill);
            return;
        }

        for (int i = idx; i < m; i++) {
            map[n][i] = true;
            dfs(depth + 1, i + 1);
            map[n][i] = false;
        }
    }
}
