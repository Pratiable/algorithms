import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<String, Boolean> map = new HashMap<>();
        String[] containers = new String[N];

        for (int i = 0; i < N; i++) {
            containers[i] = br.readLine();
            map.put(containers[i], false);
        }

        int K = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < K; i++) {
            set.add(br.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {
            if (map.get(containers[i]) || !set.contains(containers[i])) continue;
            map.put(containers[i], true);
            sb.append(containers[i]).append("\n");
        }

        for (int i = N - 1; i >= 0; i--) {
            if (map.get(containers[i])) continue;
            map.put(containers[i], true);
            sb.append(containers[i]).append("\n");
        }

        System.out.println(sb);
    }
}
