import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int max = 0;

        int[][] map = new int[n + 1][3];

        for (int i = 0; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            map[i][0] = x;
            map[i][1] = y;
            map[i][2] = e;
        }

        for (int i = 1; i < n + 1; i++) {
            int sum = Math.max(0, map[0][2] - (Math.abs(map[0][0] - map[i][0]) + Math.abs(map[0][1] - map[i][1])));
            for (int j = 1; j < n + 1; j++) {
                if (map[j][2] == 0) continue;
                sum -= Math.max(0, map[j][2] - (Math.abs(map[j][0] - map[i][0]) + Math.abs(map[j][1] - map[i][1])));
            }

            max = Math.max(sum, max);
        }

        System.out.println(max == 0 ? "IMPOSSIBLE" : max);
    }
}
