import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int T = 0; T < t; T++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            Map<Integer, Integer> map = new HashMap<>();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int cur = Integer.parseInt(st.nextToken());
                map.put(cur % k, map.getOrDefault(cur % k, 0) + 1);
                map.put(k - cur % k, map.getOrDefault(k - cur % k, 0) + 1);
            }

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int cur = Integer.parseInt(st.nextToken());
                map.put(cur % k, map.getOrDefault(cur % k, 0) - 1);
                map.put(k - cur % k, map.getOrDefault(k - cur % k, 0) - 1);
            }


            boolean canMake = true;

            for (int cur : map.values()) {
                if (cur != 0) {
                    canMake = false;
                    break;
                }
            }

            sb.append(canMake ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }
}