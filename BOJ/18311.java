import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long length = 0;

        long[] point = new long[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            point[i] = Long.parseLong(st.nextToken());
            length += point[i];
        }

        if (K < length) {
            long cur = 0;

            for (int i = 0; i < N; i++) {
                cur += point[i];
                if (K < cur) {
                    System.out.print(i + 1);
                    return;
                }
            }
        } else {
            long cur = 0;

            for (int i = N - 1; i >= 0; i--) {
                cur += point[i];
                if (K - length < cur) {
                    System.out.print(i + 1);
                    return;
                }
            }
        }
    }
}
