import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            boolean canMakeSecond = false;
            Set<Integer> set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (set.contains(a)) {
                    canMakeSecond = true;
                    break;
                }

                set.add(a);
            }

            sb.append(canMakeSecond ? "YES\n" : "NO\n");
        }

        System.out.println(sb);
    }
}
