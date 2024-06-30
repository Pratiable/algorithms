import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n;
    static boolean canHide;
    static char[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        canHide = false;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = st.nextToken().charAt(0);
            }
        }
        dfs(0, 0, 0);

        System.out.println(canHide ? "YES" : "NO");
    }

    static void dfs(int depth, int x, int y) {
        if (depth == 3) {
            if (!checkCatch()) canHide = true;
            return;
        }

        for (int i = x; i < n; i++) {
            for (int j = (i == x ? y : 0); j < n; j++) {
                if (map[i][j] != 'X') continue;
                map[i][j] = 'O';
                dfs(depth + 1, i, j + 1);
                map[i][j] = 'X';
            }
        }
    }

    static boolean checkCatch() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'T') {
                    for (int d = 0; d < 4; d++) {
                        int nx = i;
                        int ny = j;
                        while (true) {
                            nx += dx[d];
                            ny += dy[d];
                            if (nx < 0 || nx >= n || ny < 0 || ny >= n || map[nx][ny] == 'O') break;
                            if (map[nx][ny] == 'S') return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}