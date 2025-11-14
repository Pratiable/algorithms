import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] points = new int[N + 1];
        int matches = N * (N - 1) / 2;

        for (int i = 0; i < matches; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            if (C > D) {
                points[A] += 3;
            } else if (C < D) {
                points[B] += 3;
            } else {
                points[A]++;
                points[B]++;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            int rank = 1;

            for (int j = 1; j < N + 1; j++) {
                if (points[j] > points[i]) {
                    rank++;
                }
            }

            sb.append(rank).append("\n");
        }

        System.out.print(sb);
    }
}
