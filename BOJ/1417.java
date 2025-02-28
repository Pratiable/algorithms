import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int now = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (n == 1) {
            System.out.println(0);
            return;
        }

        int[] nums = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        while (now <= nums[n - 2]) {
            now++;
            cnt++;
            nums[n - 2]--;
            Arrays.sort(nums);
        }

        System.out.println(cnt);
    }
}