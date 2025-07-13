import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            int start = i == 0 ? 1 : 0;
            int end = i == n - 1 ? n - 2 : n - 1;
            int target = nums[i];

            while (start < end) {
                if (target == nums[start] + nums[end]) {
                    count++;
                    break;
                } else if (target > nums[start] + nums[end]) {
                    start = start + 1 == i ? start + 2 : start + 1;
                } else {
                    end = end - 1 == i ? end - 2 : end - 1;
                }
            }
        }

        System.out.println(count);
    }
}
