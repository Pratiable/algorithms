import java.io.*;
import java.util.*;

public class Main {
    static int n, b, w;
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        map = new boolean[n][n];
        b = 0;
        w = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = st.nextToken().equals("1");
            }
        }

        f(n, 0, 0);

        System.out.println(w + "\n" + b);
    }

    static void f(int len, int sx, int sy) {
        if (len == 1) {
            if (map[sx][sy]) {
                b++;
            } else {
                w++;
            }
            return;
        }

        boolean isSame = true;
        boolean std = map[sx][sy];

        Loop:
        for (int i = sx; i < sx + len; i++) {
            for (int j = sy; j < sy + len; j++) {
                if (map[i][j] != std) {
                    isSame = false;
                    break Loop;
                }
            }
        }

        if (isSame) {
            if (std) {
                b++;
            } else {
                w++;
            }
            return;
        }

        int nLen = len / 2;
        f(nLen, sx, sy);
        f(nLen, sx, sy + nLen);
        f(nLen, sx + nLen, sy);
        f(nLen, sx + nLen, sy + nLen);
    }
}
