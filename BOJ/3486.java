import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int aReverse = 0;
            int bReverse = 0;

            while (a > 0) {
                aReverse = aReverse * 10 + a % 10;
                a /= 10;
            }

            while (b > 0) {
                bReverse = bReverse * 10 + b % 10;
                b /= 10;
            }

            int sum = aReverse + bReverse;
            int sumReverse = 0;

            while (sum > 0) {
                sumReverse = sumReverse * 10 + sum % 10;
                sum /= 10;
            }

            sb.append(sumReverse).append("\n");
        }

        System.out.print(sb);
    }
}
