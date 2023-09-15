import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;
        int time = Integer.MAX_VALUE;
        int height = 0;
        int rands = n * m;
        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                sum += map[i][j];
            }
        }

        int maxHeight = Math.min((sum + b) / rands + 1, 256);

        while (maxHeight >= 0) {
            int s = b;
            int t = 0;

            Cal:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (t > time) break Cal;
                    if (map[i][j] > maxHeight) {
                        int gap = map[i][j] - maxHeight;
                        t += gap * 2;
                        s += gap;
                    } else if (map[i][j] < maxHeight) {
                        int gap = maxHeight - map[i][j];
                        t += gap;
                        s -= gap;
                    }
                }
            }

            if (s < 0) {
                maxHeight--;
                continue;
            };

            if (t < time) {
                time = t;
                height = maxHeight;
            } else if (t == time) {
                height = Math.max(maxHeight, height);
            }
            maxHeight--;
        }

        System.out.printf("%d %d", time, height);
    }
}