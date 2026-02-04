import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int K = Integer.parseInt(br.readLine());
            HashSet<Integer> set = new HashSet<>();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < K; i++) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            int N = Integer.parseInt(br.readLine());
            int bi = Integer.MAX_VALUE;
            int bt = Integer.MAX_VALUE;
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken());
                int h = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                if (!set.contains(id)) continue;
                if (h == -1) continue;

                int time = h * 60 + m;

                if (time <= 360) {
                    cnt++;
                    if (time < bt) {
                        bi = id;
                        bt = time;
                    }
                }
            }

            sb.append(bi).append(" ").append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
