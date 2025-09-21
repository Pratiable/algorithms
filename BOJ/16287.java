import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        boolean[] made = new boolean[400_001];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = A[i] + A[j];

                if (w - sum <= 1 || w - sum > 400_000) continue;
                if (made[w - sum]) {
                    System.out.print("YES");
                    return;
                }
            }

            for (int j = 0; j < i; j++) {
                made[A[i] + A[j]] = true;
            }
        }

        System.out.print("NO");
    }
}
