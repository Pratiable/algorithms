import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] nums = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int maxGap = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
                max = Math.max(nums[i], max);
                min = Math.min(nums[i], min);
            }

            Arrays.sort(nums);

            for (int i = 0; i < n - 1; i++) {
                maxGap = Math.max(maxGap, Math.abs(nums[i] - nums[i + 1]));
            }

            sb.append("Class ").append(t + 1).append("\n");
            sb.append(String.format("Max %d, Min %d, Largest gap %d\n", max, min, maxGap));
        }

        System.out.println(sb);
    }
}
