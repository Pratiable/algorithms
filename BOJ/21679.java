import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] limits = new int[n];

        for (int i = 0; i < n; i++) {
            limits[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] cnt = new int[n];
        for (int i = 0; i < k; i++) {
            int now = Integer.parseInt(st.nextToken());
            cnt[now - 1]++;
        }

        for (int i = 0; i < n; i++) {
            sb.append(cnt[i] > limits[i] ? "yes" : "no").append("\n");
        }

        System.out.println(sb);
    }
}
