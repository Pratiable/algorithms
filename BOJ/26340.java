import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = a;
            int y = b;
            int f = Integer.parseInt(st.nextToken());

            for (int i = 0; i < f; i++) {
                if (x > y) {
                    x /= 2;
                } else {
                    y /= 2;
                }
            }

            sb.append(String.format("Data set: %d %d %d\n%d %d\n\n", a, b, f, Math.max(x, y), Math.min(x, y)));
        }

        System.out.println(sb);
    }
}