import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        for (int n : nums) {
            if ((sum - n) == n) {
                System.out.println(n);
                break;
            }
        }
    }
}
