import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            double[] nums = new double[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Double.parseDouble(st.nextToken());
            }

            if (n % 2 == 0) {
                sb.append(String.format("Case %d: %.1f\n", t, (nums[(n / 2) - 1] + nums[n / 2]) / 2));
            } else {
                sb.append(String.format("Case %d: %.1f\n", t, nums[n / 2]));
            }
            t++;
        }

        System.out.println(sb);
    }
}
