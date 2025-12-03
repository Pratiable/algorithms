import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;

            st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            int prev = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                int now = Integer.parseInt(st.nextToken());

                if (now != prev) {
                    sb.append(now).append(" ");
                    prev = now;
                }
            }

            sb.append("$\n");
        }

        System.out.print(sb);
    }
}
