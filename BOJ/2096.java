import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dpMax = new int[n][3];
        int[][] dpMin = new int[n][3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        dpMax[0][0] = x;
        dpMax[0][1] = y;
        dpMax[0][2] = z;

        dpMin[0][0] = x;
        dpMin[0][1] = y;
        dpMin[0][2] = z;

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            dpMax[i][0] = Math.max(dpMax[i - 1][0], dpMax[i - 1][1]) + a;
            dpMax[i][1] = Math.max((Math.max(dpMax[i - 1][0], dpMax[i - 1][1])), dpMax[i - 1][2]) + b;
            dpMax[i][2] = Math.max(dpMax[i - 1][1], dpMax[i - 1][2]) + c;

            dpMin[i][0] = Math.min(dpMin[i - 1][0], dpMin[i - 1][1]) + a;
            dpMin[i][1] = Math.min((Math.min(dpMin[i - 1][0], dpMin[i - 1][1])), dpMin[i - 1][2]) + b;
            dpMin[i][2] = Math.min(dpMin[i - 1][1], dpMin[i - 1][2]) + c;
        }

        System.out.printf("%d %d", Math.max((Math.max(dpMax[n - 1][0], dpMax[n - 1][1])), dpMax[n - 1][2]), Math.min((Math.min(dpMin[n - 1][0], dpMin[n - 1][1])), dpMin[n - 1][2]));
    }
}
