import java.io.*;
import java.util.*;

public class Main {
    static int min;
    static int[] dx, dy;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        map = new int[5][5];
        dx = new int[]{0,1,0,-1};
        dy = new int[]{1,0,-1,0};
        min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());

        dfs(0, startX, startY, 0);

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    static void dfs(int depth, int x, int y, int appleCount) {
        if (appleCount == 3) {
            min = Math.min(depth, min);
            return;
        }

        for (int c = 0; c < 4; c++) {
            int nextX = x + dx[c];
            int nextY = y + dy[c];

            if (nextX >= 5 || nextY >= 5 || nextX < 0 || nextY < 0) continue;
            if (map[nextX][nextY] == -1) continue;
            int now = map[x][y];
            map[x][y] = -1;
            dfs(depth + 1, nextX, nextY, appleCount + map[nextX][nextY]);
            map[x][y] = now;
        }
    }
}