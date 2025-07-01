import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        for (int i = l; i < 101; i++) {
            int sum = i * (i - 1) / 2;
            int now = n - sum;
            if (now % i == 0) {
                int base = now / i;
                if (base >= 0) {
                    for (int j = 0; j < i; j++) {
                        sb.append(base + j).append(" ");
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
