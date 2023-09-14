import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            if (nums[i] >= s) {
                System.out.println(1);
                return;
            }
        }

        long[] sums = new long[n];
        sums[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1] + nums[i];
            if (sums[i] >= s) {
                min = Math.min(min, i + 1);
            }
        }

        // 부분합 -> sums[to] - sums[from - 1];
        for (int i = 1; i < n - 1; i++) {
            int start = i;
            int end = n - 1;
            while (start <= end) {
                int mid = (start + end) / 2;

                if (sums[mid] - sums[i - 1] >= s) {
                    min = Math.min(min, mid - i + 1);
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }
}