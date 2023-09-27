import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        int[] sorted = nums.clone();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            sorted[i] = nums[i];
        }

        Arrays.sort(sorted);
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(sorted[i])) {
                continue;
            }

            map.put(sorted[i], counter++);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(map.get(nums[i])).append(" ");
        }

        System.out.println(sb);
    }
}
