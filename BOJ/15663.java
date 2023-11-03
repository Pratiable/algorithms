import java.io.*;
import java.util.*;

class Main {
    static int n, m;
    static int[] nums, seq;
    static HashSet<String> set;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        seq = new int[n];
        visited = new boolean[n];
        set = new HashSet<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        Arrays.fill(seq, -1);
        sb = new StringBuilder();

        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(seq[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            if (seq[depth] == nums[i]) continue;
            for (int j = depth; j < m; j++) {
                seq[j] = -1;
            }
            visited[i] = true;
            seq[depth] = nums[i];
            dfs(depth + 1);
            visited[i] = false;
        }
    }
}