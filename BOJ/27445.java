import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int[][] check = new int[n][m];

        for (int i = 0; i < n - 1; i++) {
            int distance = Integer.parseInt(br.readLine());
            map[i][0] = distance;
            if (map[i][0] == 0) {
                System.out.printf("%d %d", i + 1, 1);
                return;
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (Math.abs(j - i) + Math.abs(-k) == distance) {
                        check[j][k]++;
                    }
                }
            }
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int distance = Integer.parseInt(st.nextToken());
            map[n - 1][i] = distance;
            if (map[n - 1][i] == 0) {
                System.out.printf("%d %d", n, i + 1);
                return;
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (Math.abs(j - (n - 1)) + Math.abs(k - i) == distance) {
                        check[j][k]++;
                    }
                }
            }
        }

        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (check[i][j] > max) {
                    x = i;
                    y = j;
                    max = check[i][j];
                }
            }
        }
        
        System.out.printf("%d %d", x + 1, y + 1);
    }
}