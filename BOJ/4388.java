import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (Objects.equals(a, "0") && Objects.equals(b, "0")) break;

            a = "0".repeat(10 - a.length()) + a;
            b = "0".repeat(10 - b.length()) + b;


            int[] as = new int[11];
            int[] bs = new int[11];

            for (int i = 1; i <= a.length(); i++) {
                as[i] = a.charAt(i - 1) - '0';
            }

            for (int i = 1; i <= b.length(); i++) {
                bs[i] = b.charAt(i - 1) - '0';
            }

            int cnt = 0;

            for (int i = 10; i > 0; i--) {
                if (as[i] + bs[i] >= 10) {
                    as[i - 1]++;
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}