import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int m = Integer.parseInt(br.readLine());
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int now = Integer.parseInt(br.readLine());
                int next = now + 1;
                if (next > 0 && next < 7) {
                    nums.add(next);
                }
            }
            sb.append("Case ").append(t).append(":\n");

            for (int num : nums) {
                sb.append(num).append("\n");
            }
        }
        System.out.println(sb);
    }
}
