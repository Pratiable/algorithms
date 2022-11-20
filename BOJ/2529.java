import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    static boolean[] visited;
    static long max, min;
    static String[] operators;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        n = Integer.parseInt(str);
        max = 0;
        min = 9876543211L;
        visited = new boolean[10];
        operators = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) operators[j] = st.nextToken();
        for (int k = 0; k < 10; k++) {
            visited[k] = true;
            make(String.valueOf(k), k, 0, true);
            visited[k] = false;
        }

        System.out.println(String.valueOf(max).length() == n + 1 ? max : "0" + max);
        System.out.println(String.valueOf(min).length() == n + 1 ? min : "0" + min);
    }

    public static void make(String num, int lastNum, int depth, boolean isValid) {
        if (!isValid) return;
        if (depth == n) {
            max = Math.max(max, Long.parseLong(num));
            min = Math.min(min, Long.parseLong(num));
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            make(num + i, i, depth + 1, compare(operators[depth], lastNum, i));
            visited[i] = false;
        }
    }

    static boolean compare(String operator, int a, int b) {
        if (">".equals(operator)) {
            return a > b;
        }
        return a < b;
    }
}