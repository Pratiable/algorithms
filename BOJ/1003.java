import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[][] d = new int[41][2];
        d[0] = new int[]{1, 0};
        d[1] = new int[]{0, 1};
        d[2] = new int[]{1, 1};

        for (int i = 3; i < 41; i++) {
            d[i][0] = d[i - 2][0] + d[i - 1][0];
            d[i][1] = d[i - 2][1] + d[i - 1][1];
        }


        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(d[n][0]).append(" ").append(d[n][1]).append("\n");
        }

        System.out.println(sb);
    }
}
