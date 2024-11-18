import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[N];
        int[] nums2 = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            nums2[i] = nums[i];
        }

        Arrays.sort(nums2);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (!map.containsKey(nums2[i])) map.put(nums2[i], i);
        }

        for (int i = 0; i < N; i++) {
            int rank = map.get(nums[i]) + 1;
            sb.append(rank).append("\n");
        }

        System.out.println(sb);
    }
}
