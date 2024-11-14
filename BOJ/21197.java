import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        if (n % 2 != 0) {
            System.out.println("still running");
            return;
        }

        int res = 0;
        for (int i = 0; i < n; i += 2) {
            res += nums[i + 1] - nums[i];
        }
        System.out.println(res);
    }
}