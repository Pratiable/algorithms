import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] M = new int[11];
        int sum = 0;

        for (int i = 0; i < 11; i++) {
            M[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            double L = Double.parseDouble(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            if (S >= 17 && L >= 2.0) {
                sum += M[B];
            }
        }

        System.out.print(sum);
    }
}
