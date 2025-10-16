import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()) - 1;
        int e = Integer.parseInt(st.nextToken()) - 1;
        int x = 0;
        int y = 0;

        if (n > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                x += Integer.parseInt(st.nextToken());
            }
        } else {
            br.readLine();
        }

        if (e > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < e; i++) {
                y += Integer.parseInt(st.nextToken());
            }
        }

        System.out.print((int) Math.ceil(Math.hypot(x, y)));
    }
}
