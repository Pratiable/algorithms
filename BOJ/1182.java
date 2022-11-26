import java.io.*;
import java.util.*;

public class Main {
    static int n, s, cnt;
    static int[] nums;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        cnt = 0;
        nums = new int[n];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        make(0, 0);
        System.out.println(cnt);
    }

    static void make(int sum, int index) {
        if (index == n) return;

        for (int j = index; j < n; j++) {
            if (visited[j]) continue;
            visited[j] = true;
            make(sum + nums[j], j + 1);
            if (sum + nums[j] == s) {
                cnt++;
            }
            visited[j] = false;
        }
    }
}