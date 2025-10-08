import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int G = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < G; i++) {
                int cur = Integer.parseInt(st.nextToken());
                map.put(cur, map.getOrDefault(cur, 0) + 1);
            }

            for (int guest: map.keySet()) {
                if (map.get(guest) % 2 == 1) {
                    sb.append("Case #").append(t + 1).append(": ").append(guest).append("\n");
                    break;
                }
            }
        }

        System.out.print(sb);
    }
}
