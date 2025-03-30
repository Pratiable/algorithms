import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n, cnt;
    static boolean[][] map;
    static int[] dx = {0, 1, 1};
    static int[] dy = {1, 1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        cnt = 0;
        map = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = st.nextToken().equals("1");
            }
        }

        /*
        cmd
        1 -> right
        2 -> down
        3 -> diag
         */
        pipe(0, 1, 1);

        System.out.println(cnt);
    }

    static void pipe(int x, int y, int cmd) {
        if (x == n - 1 && y == n - 1) {
            cnt++;
            return;
        }

        if (cmd == 1) {
            if (canMove(x, y, 1)) pipe(x + dx[0], y + dy[0], 1);
            if (canMove(x, y, 3)) pipe(x + dx[1], y + dy[1], 3);
        } else if (cmd == 2) {
            if (canMove(x, y, 2)) pipe(x + dx[2], y + dy[2], 2);
            if (canMove(x, y, 3)) pipe(x + dx[1], y + dy[1], 3);
        } else {
            if (canMove(x, y, 2)) pipe(x + dx[2], y + dy[2], 2);
            if (canMove(x, y, 3)) pipe(x + dx[1], y + dy[1], 3);
            if (canMove(x, y, 1)) pipe(x + dx[0], y + dy[0], 1);
        }
    }

    static boolean canMove(int x, int y, int cmd) {
        if (cmd == 1) {
            int nx = x + dx[0];
            int ny = y + dy[0];
            return nx >= 0 && ny >= 0 && nx < n && ny < n && !map[nx][ny];
        } else if (cmd == 2) {
            int nx = x + dx[2];
            int ny = y + dy[2];
            return nx >= 0 && ny >= 0 && nx < n && ny < n && !map[nx][ny];
        } else {
            for (int i = 0; i < 3; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n || map[nx][ny]) return false;
            }
        }
        return true;
    }
}