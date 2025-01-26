import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        double x = Math.sqrt(w * w + h * h);

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());
            sb.append(now <= x ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }
}