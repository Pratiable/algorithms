import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(nums[i + 1] - nums[i], min);
        }

        int cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] - nums[i] == min) cnt++;
        }

        System.out.printf("%d %d", min, cnt);
    }
}
