import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        Arrays.sort(nums);

        System.out.printf("%.6f%n%.6f%n", (double) sum / N, N % 2 == 1 ? nums[N / 2] : (nums[N / 2 - 1] + nums[N / 2]) / 2.0);
    }
}
