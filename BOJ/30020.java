import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        StringBuilder sb= new StringBuilder();

        while (true) {
            if (b == 0) break;
            if (b == a - 1) {
                System.out.println("YES");
                System.out.println(cnt + 1);
                sb.append("ab".repeat(b)).append("a");
                System.out.println(sb);
                return;
            }

            a -= 2;
            b -= 1;

            if (a < 0 || b < 0) break;
            cnt++;
            sb.append("aba\n");
        }

        System.out.println("NO");
    }
}
