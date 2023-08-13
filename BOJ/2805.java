import java.io.*;
import java.util.*;

public class Main {
    static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());

        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 2_000_000_000;

        while (start <= end) {
            int mid = (start + end) / 2;
            long sum = leftTree(mid);
            if (sum >= m) {
                max = Math.max(max, mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(max);
    }

    static long leftTree(int cut) {
        long sum = 0;
        for (int num : nums) {
            sum += Math.max(num - cut, 0);
        }

        return sum;
    }
}
