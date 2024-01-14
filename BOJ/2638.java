import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int n, m;
    static boolean[][] map, opened;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                if (Objects.equals(st.nextToken(), "1")) {
                    map[i][j] = true;
                }
            }
        }

        int time = 0;
        while (isRemain()) {
            checkOutside();
            checkOpenPoint();
            time++;
        }

        System.out.println(time);
    }

    static void checkOutside() {
        opened = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        queue.add(new int[]{0, 0});
        visited[0][0] = true;
        opened[0][0] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny]) continue;
                visited[nx][ny] = true;
                opened[nx][ny] = true;
                queue.add(new int[]{nx, ny});
            }
        }
    }

    static void checkOpenPoint() {
        Queue<int[]> queue = new LinkedList<>();
        Queue<int[]> melts = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny]) continue;
                visited[nx][ny] = true;
                if (map[nx][ny]) {
                    if (isOpened(nx, ny)) {
                        melts.add(new int[]{nx, ny});
                    }
                    continue;
                }
                queue.add(new int[]{nx, ny});
            }
        }

        while (!melts.isEmpty()) {
            int[] now = melts.poll();
            map[now[0]][now[1]] = false;
        }
    }

    static boolean isRemain() {
        boolean isRemain = false;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (map[i][j]) return true;
            }
        }
        return isRemain;
    }

    static boolean isOpened(int x, int y) {
        int openedLine = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if (!map[nx][ny] && opened[nx][ny]) openedLine++;
        }

        return openedLine >= 2;
    }
}