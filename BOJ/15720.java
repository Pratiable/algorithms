import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int min = Math.min(B, Math.min(C, D));

        int[] Bp = new int[B];
        int[] Cp = new int[C];
        int[] Dp = new int[D];
        int sum = 0;
        int discount = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            Bp[i] = Integer.parseInt(st.nextToken());
            sum += Bp[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            Cp[i] = Integer.parseInt(st.nextToken());
            sum += Cp[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < D; i++) {
            Dp[i] = Integer.parseInt(st.nextToken());
            sum += Dp[i];
        }

        Arrays.sort(Bp);
        Arrays.sort(Cp);
        Arrays.sort(Dp);

        for (int i = 0; i < min; i++) {
            discount += (Bp[B - 1 - i] + Cp[C - 1 - i] + Dp[D - 1 - i]) / 10;
        }

        System.out.println(sum);
        System.out.println(sum - discount);
    }
}
