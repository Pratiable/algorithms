import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[100010];

        Arrays.fill(nums, Integer.MAX_VALUE);

        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;

        for (int i = 4; i < n + 1; i++) {
            int rooted = (int) Math.sqrt(i);
            for (int j = rooted; j > 0; j--) {
                nums[i] = Math.min(nums[i], nums[i - j * j] + 1);
            }
        }

        System.out.println(nums[n]);
    }
}