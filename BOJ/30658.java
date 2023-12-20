import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                nums.add(Integer.parseInt(br.readLine()));
            }

            Collections.reverse(nums);

            for (int now : nums) {
                sb.append(now).append("\n");
            }
            sb.append("0\n");
        }

        System.out.println(sb);
    }
}
