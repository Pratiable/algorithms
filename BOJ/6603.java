import java.io.*;
import java.util.*;

public class Main {
    public static int[] nums;
    public static int[] result;
    public static boolean[] check;
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String tc;
        sb = new StringBuilder();
        while (true) {
            tc = br.readLine();
            if (Objects.equals(tc, "0")) {
                break;
            }
            st = new StringTokenizer(tc);
            int n = Integer.parseInt(st.nextToken());
            nums = new int[n];
            result = new int[6];
            check = new boolean[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }
            make(0, 0);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void make(int count, int lastNum) {
        if (count == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] <= lastNum) continue;
            result[count] = nums[j];
            make(count + 1, nums[j]);
        }
    }
}