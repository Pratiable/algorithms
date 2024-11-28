import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n + 1];

        for (int i = 0; i < 2 * n - 1; i++) {
            int now = Integer.parseInt(st.nextToken());
            nums[now]++;
        }

        for (int i = 1; i < n + 1; i++) {
            if (nums[i] == 1) {
                System.out.println(i);
                return;
            }
        }
    }
}
