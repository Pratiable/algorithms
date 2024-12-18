import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] advertised = new boolean[m + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            for (int j = l; j <= r; j++) advertised[j] = true;
        }

        for (int i = 1; i <= m; i++) {
            if (!advertised[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}