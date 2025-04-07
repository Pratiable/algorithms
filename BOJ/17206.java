import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ans = new int[80001];

        int sum = 0;

        for (int i = 1; i < 80001; i++) {
            if (i % 3 == 0 || i % 7 == 0) sum += i;
            ans[i] = sum;
        }

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(ans[n]).append("\n");
        }

        System.out.println(sb);
    }
}