import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long[] nums = new long[n];
        int cnt = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] != -1 && Math.abs(nums[i - 1] - nums[i]) < m) {
                nums[i] = -1;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}