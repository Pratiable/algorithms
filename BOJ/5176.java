import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for (int t = 0; t < K; t++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());

            for (int i = 0; i < P; i++) {
                int cur = Integer.parseInt(br.readLine());
                set.add(cur);
            }

            sb.append(P - set.size()).append("\n");
            set.clear();
        }

        System.out.print(sb);
    }
}
