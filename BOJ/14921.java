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

        int left = 0;
        int right = n - 1;
        int min = Integer.MAX_VALUE;

        while (left < right) {
            if (Math.abs(nums[left] + nums[right]) < Math.abs(min)) {
                min = nums[left] + nums[right];
            }

            if (Math.abs(nums[left] + nums[right - 1]) < Math.abs(nums[left + 1] + nums[right])) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println(min);
    }
}