import java.io.*;
import java.util.*;

public class Main {
    static int[][] map, dp;
    static int n, fCnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        fCnt = 0;
        map = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        fMatrixPathRec(n ,n);

        System.out.printf("%d %d", fCnt, (int) Math.pow(n, 2));
    }

    static int fMatrixPathRec(int i, int j) {
        if (i == 0 || j == 0) {
            fCnt++;
            return 0;
        }
        return map[i][j] + (Math.max(fMatrixPathRec(i - 1, j), fMatrixPathRec(i, j - 1)));
    }
}