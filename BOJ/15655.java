import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] check;
    public static int n;
    public static int m;
    public static int[] nums;
    public static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        check = new boolean[10001];
        nums = new int[n];
        result = new int[m + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        make(0, 0);

        System.out.println(sb);
    }

    public static void make(int count, int max) {
        if (count == m) {
            for (int j = 1; j <= m; j++){
                sb.append(result[j]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int num : nums) {
            if (num < max) continue;
            if (check[num]) continue;
            result[count + 1] = num;
            check[num] = true;
            make(count + 1, num);
            check[num] = false;
        }
    }
}