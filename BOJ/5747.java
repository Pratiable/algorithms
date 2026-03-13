import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            int maryEven = 0;
            int maryOdd = 0;
            int johnEven = 0;
            int johnOdd = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int n = Integer.parseInt(st.nextToken());
                if (n % 2 == 0) {
                    maryEven++;
                    continue;
                }

                maryOdd++;
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int n = Integer.parseInt(st.nextToken());
                if (n % 2 == 0) {
                    johnEven++;
                    continue;
                }

                johnOdd++;
            }

            sb.append(N - (Math.min(maryEven, johnOdd) + Math.min(maryOdd, johnEven))).append("\n");
        }

        System.out.print(sb);
    }
}
