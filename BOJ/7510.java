import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int[] pts = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            pts[0] = Integer.parseInt(st.nextToken());
            pts[1] = Integer.parseInt(st.nextToken());
            pts[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(pts);

            sb.append("Scenario #").append(t + 1).append(":\n");
            sb.append(Math.pow(pts[0], 2) + Math.pow(pts[1], 2) == Math.pow(pts[2], 2) ? "yes" : "no").append("\n\n");
        }

        System.out.println(sb);
    }
}