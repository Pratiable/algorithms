import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringTokenizer st2;

        for (int T = 0; T < t; T++) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            int[] b = new int[n];
            st = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                b[i] = Integer.parseInt(st2.nextToken());
            }

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) count += a[i] - b[i];
            }

            sb.append(count + 1).append("\n");
        }

        System.out.println(sb);
    }
}
