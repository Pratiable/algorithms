import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dots = new int[n][2];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            dots[i][0] = a;
            dots[i][1] = b;
        }

        Arrays.sort(dots, (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        int sum = 0;

        sum += dots[1][0] - dots[0][0];

        for (int i = 1; i < n - 1; i++) {
            int x = dots[i][0];
            int color = dots[i][1];
            sum += color == dots[i + 1][1] && dots[i - 1][1] == color
                    ? Math.min(dots[i + 1][0] - x, x - dots[i - 1][0])
                    : color == dots[i + 1][1]
                    ? dots[i + 1][0] - x
                    : x - dots[i - 1][0];
        }

        sum += dots[n - 1][0] - dots[n - 2][0];

        System.out.println(sum);
    }
}