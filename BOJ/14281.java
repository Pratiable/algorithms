import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        if (n <= 2) {
            System.out.println(0);
            return;
        }

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;

        while (true) {
            boolean isMade = true;
            for (int i = 1; i < n - 1; i++) {
                int closeNumbersSum = nums[i - 1] + nums[i + 1];
                if (closeNumbersSum < 2 * nums[i]) {
                    int gap = (closeNumbersSum) / 2;
                    sum += nums[i] - gap;
                    nums[i] = gap;
                    isMade = false;
                }
            }
            if (isMade) break;
        }

        System.out.println(sum);
    }
}
