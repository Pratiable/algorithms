import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] result;
    static boolean isDone;
    static boolean[] visited;
    static String str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        str = br.readLine();
        n = str.length() > 9 ? ((str.length() - 9) / 2) + 9 : str.length();
        result = new int[n];
        visited = new boolean[n + 1];

        dfs(0, 0);
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }

    static void dfs(int depth, int idx) {
        if (isDone) return;
        if (depth == n) {
            for (int i = 1; i < n; i++) {
                if(!visited[i]) return;
            }
            isDone = true;
            return;
        }

        if (str.charAt(idx) == '0') return;
        if (idx >= str.length()) return;

        if (idx < str.length() - 1) {
            int twoDigits = (str.charAt(idx) - '0') * 10 + (str.charAt(idx + 1) - '0');
            if (twoDigits <= n && !visited[twoDigits]) {
                visited[twoDigits] = true;
                result[depth] = twoDigits;
                dfs(depth + 1, idx + 2);
                visited[twoDigits] = false;
            }
        }

        int oneDigit = str.charAt(idx) - '0';
        if (!visited[oneDigit] && !isDone) {
            visited[oneDigit] = true;
            result[depth] = oneDigit;
            dfs(depth + 1, idx + 1);
            visited[oneDigit] = false;
        }
    }
}
