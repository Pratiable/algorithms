import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Integer[] sorted = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(sorted, Collections.reverseOrder());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) continue;
            sum += sorted[i - 1];
        }

        System.out.println(sum);
    }
}