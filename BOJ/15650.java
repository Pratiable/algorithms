import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] check;
    public static StringBuilder sb = new StringBuilder();
    public static int n;
    public static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        check = new boolean[n + 1];
        make(0, 0);

        System.out.println(sb);
    }

    public static void make(int count, int max) {
        if (count == m) {
            for (int i = 1; i < check.length; i++) {
                if (check[i]) sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int j = 1; j <= n; j++) {
            if (check[j]) continue;
            if (j < max) continue;
            check[j] = true;
            make(count + 1, j);
            check[j] = false;
        }
    }
}