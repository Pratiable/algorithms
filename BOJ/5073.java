import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int[] nums = new int[3];
            for (int i = 0; i < 3; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);
            if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) break;

            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                sb.append("Equilateral\n");
            } else if (nums[2] >= nums[0] + nums[1]) {
                sb.append("Invalid\n");
            } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
                sb.append("Isosceles\n");
            } else {
                sb.append("Scalene\n");
            }
        }

        System.out.println(sb);
    }
}
