import java.io.*;
import java.util.*;

public class Main {
    static int R, C, K, count;
    static char[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new boolean[R][C];
        count = 0;

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        move(1, R - 1, 0);
        System.out.println(count);
    }

    static void move(int depth, int x, int y) {
        if (depth > K) return;
        if (x == 0 && y == C - 1) {
            if (depth == K) count++;
            return;
        }

        if (map[x][y] == 'T') return;
        if (visited[x][y]) return;

        visited[x][y] = true;
        if (x < R - 1) {
            move(depth + 1, x + 1, y);
        }

        if (y < C - 1) {
            move(depth + 1, x, y + 1);
        }

        if (x > 0) {
            move(depth + 1, x - 1, y);
        }

        if (y > 0) {
            move(depth + 1, x, y - 1);
        }

        visited[x][y] = false;

    }
}