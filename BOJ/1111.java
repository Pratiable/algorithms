import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        if (n == 1) {
            System.out.println("A");
            return;
        }

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int a = 0;
        int b = 0;
        int ans = 0;
        boolean found = false;

        for (int i = -1000; i < 1000; i++) {
            boolean isRight = true;
            int j = nums[1] - nums[0] * i;
            for (int k = 1; k < n - 1; k++) {
                if (nums[k] * i + j != nums[k + 1]) {
                    isRight = false;
                    break;
                }
            }

            if (isRight) {
                int foundAns = nums[n - 1] * i + j;
                if (found && ans != foundAns) {
                    System.out.println("A");
                    return;
                }
                ans = foundAns;

                found = true;
                a = i;
                b = j;
            }
        }

        System.out.println(found ? nums[n - 1] * a + b : "B");
    }
}