import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] map, d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        d = new int[1001][4];
        map = new int[1001][4];

        for (int i = 1; i < n + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 4; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (n == 1) {
            System.out.println(Math.min(Math.min(map[1][1], map[1][2]), map[1][3]));
            return;
        }

        d[1][1] = map[1][1];
        d[1][2] = map[1][2];
        d[1][3] = map[1][3];

        for (int i = 2; i < n + 1; i++) {
            d[i][1] = Math.min(d[i - 1][2], d[i - 1][3]) + map[i][1];
            d[i][2] = Math.min(d[i - 1][1], d[i - 1][3]) + map[i][2];
            d[i][3] = Math.min(d[i - 1][1], d[i - 1][2]) + map[i][3];
        }

        System.out.println(Math.min(d[n][3], Math.min(d[n][1], d[n][2])));
    }
}
