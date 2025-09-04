import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Set<Integer> set = new HashSet<>();
            int cnt = 0;

            for (int i = N; i <= M; i++) {
                int cur = i;
                boolean isDuplicated = false;

                while (cur > 0) {
                    int next = cur % 10;
                    if (set.contains(next)) {
                        isDuplicated = true;
                        break;
                    }
                    set.add(next);
                    cur /= 10;
                }

                if (!isDuplicated) cnt++;
                set.clear();
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
