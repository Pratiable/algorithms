import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Set<Integer> left = new HashSet<>();
            Set<Integer> right = new HashSet<>();
            for (int i = 0; i < m; i++) {
                left.add(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                right.add(Integer.parseInt(st.nextToken()));
            }

            int cnt = 0;

            for (int now : left) {
                if (left.contains(now + 500) && right.contains(now + 1000) && right.contains(now + 1500)) cnt++;
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}