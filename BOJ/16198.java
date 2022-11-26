import java.io.*;
import java.util.*;

public class Main {
    static int n, max;
    static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        max = 0;
        nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        make(nums, 0);
        System.out.println(max);
    }

    static void make(int[] beats, int sum) {
        if (beats.length == 2) {
            max = Math.max(max, sum);
            return;
        }

        for (int j = 1; j < beats.length - 1; j++) {
            int[] arr = new int[beats.length - 1];
            for (int k = 0, l = 0; k < beats.length; k++) {
                if (k != j) {
                    arr[l++] = beats[k];
                }
            }
            make(arr, (beats[j - 1] * beats[j + 1]) + sum);
        }
    }
}