import java.io.*;
import java.util.*;

public class Main {
    static int[] d = new int[1_000_001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        System.out.println(dp(x));
    }

    static int dp (int num) {
        if (num == 1) return 0;

        if (d[num] > 0) {
            return d[num];
        }

        d[num] = dp(num - 1) + 1;

        if (num % 3 == 0) {
            int tmp = dp(num / 3) + 1;
            if (tmp < d[num]) {
                d[num] = tmp;
            }
        }

        if (num % 2 == 0) {
            int tmp = dp(num / 2) + 1;
            if (tmp < d[num]) {
                d[num] = tmp;
            }
        }

        return d[num];
    }
}