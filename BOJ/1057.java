import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int f = Math.min(a, b);
        int r = Math.max(a, b);
        int cnt = 1;

        while (true) {
            if (f % 2 == 1 && f + 1 == r) break;
            n = n % 2 == 1 ? (n / 2) + 1 : n / 2;
            f = f % 2 == 1 ? (f + 1) / 2 : f / 2;
            r = r % 2 == 1 ? (r + 1) / 2 : r / 2;
            cnt++;
        }

        System.out.println(cnt);
    }
}