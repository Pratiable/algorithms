import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] coords = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coords[i][0] = Integer.parseInt(st.nextToken());
            coords[i][1] = Integer.parseInt(st.nextToken());
        }

        int dist = 0;
        for (int i = 0; i < n - 1; i++) {
            int x = Math.abs(coords[i][0] - coords[i + 1][0]);
            int y = Math.abs(coords[i][1] - coords[i + 1][1]);
            dist += x + y;
        }

        System.out.println(dist);
    }
}
