import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] triangle = new int[n + 1][n];
        int[][] d = new int [n + 1][n];
        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (n == 1) {
            System.out.println(triangle[1][0]);
            return;
        }

        if (n == 2) {
            System.out.println(Math.max(triangle[2][0], triangle[2][1]) + triangle[1][0]);
            return;
        }

        d[1][0] = triangle[1][0];
        d[2][0] = triangle[2][0] + d[1][0];
        d[2][1] = triangle[2][1] + d[1][0];

        for (int i = 3; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    d[i][j] = d[i - 1][j] + triangle[i][j];
                } else if (j == i - 1) {
                    d[i][j] = d[i - 1][j - 1] + triangle[i][j];
                } else {
                    d[i][j] = Math.max(d[i - 1][j - 1], d[i - 1][j]) + triangle[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(d[n][i], max);
        }
        System.out.println(max);
    }
}