import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] sumTwoNumbers = new int[N * N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sumTwoNumbers[i * N + j] = nums[i] + nums[j];
            }
        }

        Arrays.sort(sumTwoNumbers);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                int target = nums[i] - nums[j];
                if (hasTarget(sumTwoNumbers, target)) {
                    max = Math.max(nums[i], max);
                    break;
                }
            }
        }

        System.out.println(max);
    }

    static boolean hasTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}