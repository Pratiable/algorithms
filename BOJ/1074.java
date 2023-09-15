import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 0, 1, 1};
    static int[] dy = {0, 1, 0, 1};
    static int[][] map;
    static int r, c;
    static boolean isDone;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        isDone = false;
        z(n, 0, 0, 0);
    }

    static void z(int n, int start, int x, int y) {
        if (n == 1) {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (r == nx && c == ny) {
                    System.out.println(start + i);
                    isDone = true;
                }
            }
            return;
        }

        int nPow = (int) Math.pow(2, n);
        int nPowDiv = nPow / 2;
        int sp = (nPow * nPow) / 4;
        for (int i = 0; i < 4; i++) {
            if (isDone) return;
            int nx = x + (nPowDiv * dx[i]);
            int ny = y + (nPowDiv * dy[i]);
            int mx = x + sp;
            int my = y + sp;
            if (nx <= r && ny <= c && r <= mx && c <= my) {
                z(n - 1, start + (i * sp), nx, ny);
            }
        }
    }
}