import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited, made;
    static int[] nums;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        visited = new boolean[n];
        made = new boolean[2_000_000];
        f(0, 0);

        for (int i = 1; i < made.length; i++) {
            if (!made[i]) {
                System.out.println(i);
                return;
            }
        }
    }

    static void f(int idx, int sum) {
        if (idx == n) return;
        for (int i = idx; i < n; i++) {
            int now = sum + nums[i];
            made[now] = true;
            f(i + 1, sum + nums[i]);
        }
    }
}