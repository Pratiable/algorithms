import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (n == 1) {
                sb.append("YES\n");
                continue;
            }

            boolean isAsc = true;
            int[] nums = new int[n];
            int first = Integer.parseInt(st.nextToken());
            nums[0] = Math.min(first, n - first + 1);

            for (int i = 1; i < n; i++) {
                int now = Integer.parseInt(st.nextToken());
                int unConv = now >= nums[i - 1] ? now : Integer.MAX_VALUE;
                int conv = n - now + 1 >= nums[i - 1] ? n - now + 1 : Integer.MAX_VALUE;

                nums[i] = Math.min(unConv, conv);

                if (nums[i] == Integer.MAX_VALUE) {
                    isAsc = false;
                    break;
                }
            }

            sb.append(isAsc ? "YES\n" : "NO\n");
        }

        System.out.println(sb);
    }
}