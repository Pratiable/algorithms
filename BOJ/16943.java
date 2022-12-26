import java.io.*;
import java.util.*;

public class Main {
    static int max;
    static int b, n;
    static char[] nums, result;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String combinations = st.nextToken();
        n = combinations.length();
        nums = new char[n];
        result = new char[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            nums[i] = combinations.charAt(i);
        }
        b = Integer.parseInt(st.nextToken());
        max = -1;
        dfs(0);
        System.out.println(max);
    }

    static void dfs(int depth) {
        if (depth == n) {
            if (result[0] != '0') {
                int answer = 0;
                for (int j = 0; j < n; j++) {
                    answer = (answer * 10) + (result[j] - '0');
                }
                if (answer < b) {
                    max = Math.max(answer, max);
                }
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            result[depth] = nums[i];
            dfs(depth + 1);
            visited[i] = false;
        }
    }
}
