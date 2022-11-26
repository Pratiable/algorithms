import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] ans, nums;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        nums = new int[n];
        ans = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        make(0, 0);
        System.out.println(sb);
    }

    static void make(int depth, int index) {
        if (depth == m) {
            for (int num: ans) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int j = index; j < n; j++) {
            ans[depth] = nums[j];
            make(depth + 1, j);
        }
    }
}