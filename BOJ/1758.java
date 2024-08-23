import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums, Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i] - i;
            if (num < 0) break;
            sum += num;
        }

        System.out.println(sum);
    }
}