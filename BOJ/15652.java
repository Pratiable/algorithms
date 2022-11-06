import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int n;
    public static int m;
    public static int[] num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        num = new int[m + 1];
        make(0, 0);

        System.out.println(sb);
    }

    public static void make(int count, int max) {
        if (count == m) {
            for (int i = 1; i <= m; i++) {
                sb.append(num[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int j = 1; j <= n; j++) {
            if (j < max) continue;
            num[count + 1] = j;
            make(count + 1, j);
        }
    }
}