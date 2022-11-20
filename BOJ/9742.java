import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int n, now, target;
    static char[] chars;
    static char[] result;
    static String check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            String str = st.nextToken();
            target = Integer.parseInt(st.nextToken()) - 1;
            now = 0;
            n = str.length();
            visited = new boolean[str.length()];
            result = new char[n];
            chars = new char[n];
            for (int i = 0; i < str.length(); i++) {
                chars[i] = str.charAt(i);
            }
            make(0);
            sb.append(str).append(" ").append(target + 1).append(" = ").append(target < now ? check : "No permutation").append("\n");
        }

        System.out.println(sb);
    }

    static void make(int depth) {
        if (now > target) return;
        if (depth == n) {
            if (now == target) {
                check = String.valueOf(result);
            }
            now++;
            return;
        }

        for (int j = 0; j < chars.length; j++) {
            if (visited[j]) continue;
            visited[j] = true;
            result[depth] = chars[j];
            make(depth + 1);
            visited[j] = false;
        }
    }
}