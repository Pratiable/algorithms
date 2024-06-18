import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringTokenizer st;
        long[][] nums = new long[(int) n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            nums[i][0] = Long.parseLong(st.nextToken());
            nums[i][1] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        Arrays.sort(nums, Comparator.comparingLong(o -> o[0]));

        for (int i = 1; i <= n; i++) {
            sum += (nums[i - 1][0] * i) + nums[i - 1][1];
        }

        System.out.println(sum);
    }
}
