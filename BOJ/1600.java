import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] dxh = new int[]{-2, -2, -1, 1, 2, 2, 1, -1};
        int[] dyh = new int[]{-1, 1, 2, 2, 1, -1, -2, -2};
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int hCnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] map = new int[w][h];
        boolean[][][] visited = new boolean[w][h][31];
        boolean canArrive = false;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < w; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < h; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<int[]> queue = new LinkedList<>();

        visited[0][0][hCnt] = true;
        queue.add(new int[]{0, 0, 0, hCnt});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            if (now[0] == w - 1 && now[1] == h - 1) {
                canArrive = true;
                min = Math.min(min, now[2]);
                continue;
            }

            if (now[3] > 0) {
                for (int i = 0; i < 8; i++) {
                    int nx = now[0] + dxh[i];
                    int ny = now[1] + dyh[i];

                    if (nx < 0 || ny < 0 || nx >= w || ny >= h) continue;
                    if (visited[nx][ny][now[3] - 1] || map[nx][ny] == 1) continue;
                    visited[nx][ny][now[3] - 1] = true;
                    queue.add(new int[]{nx, ny, now[2] + 1, now[3] - 1});
                }
            }

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= w || ny >= h) continue;
                if (visited[nx][ny][now[3]] || map[nx][ny] == 1) continue;
                visited[nx][ny][now[3]] = true;
                queue.add(new int[]{nx, ny, now[2] + 1, now[3]});
            }
        }

        if (!canArrive) {
            System.out.println(-1);
            return;
        }

        System.out.println(min);
    }
}