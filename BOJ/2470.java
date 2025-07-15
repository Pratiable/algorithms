import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        int low = nums[0];
        int high = nums[n - 1];
        int min = Integer.MAX_VALUE;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (Math.abs(nums[left] + nums[right]) < Math.abs(min)) {
                min = nums[left] + nums[right];
                low = nums[left];
                high = nums[right];
            }

            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                right--;
            } else {
                left++;
            }
        }

        System.out.printf("%d %d", low, high);
    }
}