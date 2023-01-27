import java.io.*;
import java.util.*;

public class Main {
    static long a, b;
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        min = Integer.MAX_VALUE;
        dfs(1, a);

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    static void dfs(int depth, long num) {
        if (num == b) {
            min = Math.min(depth, min);
        }

        if (num > b) return;

        dfs(depth + 1, num * 2);
        dfs(depth + 1, num * 10 + 1);
    }
}