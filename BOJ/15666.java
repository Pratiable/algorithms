import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] nums, made;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> set = new TreeSet<>();
        made = new int[m];

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        nums = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            nums[i++] = num;
        }

        f(0, 0);

        System.out.println(sb);
    }

    public static void f(int numIdx, int idx) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                sb.append(made[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = numIdx; i < nums.length; i++) {
            made[idx] = nums[i];
            f(i, idx + 1);
        }
    }
}
