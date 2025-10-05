import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int C = Integer.parseInt(br.readLine());
            int I = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            int[] prices = new int[I];

            for (int i = 0; i < I; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            int idx1 = 0;
            int idx2 = 0;

            for (int i = 0; i < I; i++) {
                int price = prices[i];
                if (map.containsKey(C - price)) {
                    idx1 = map.get(C - price) + 1;
                    idx2 = i + 1;
                    break;
                }

                if (!map.containsKey(price)) {
                    map.put(price, i);
                }
            }

            sb.append("Case #").append(t + 1).append(": ").append(Math.min(idx1, idx2)).append(" ").append(Math.max(idx1, idx2)).append("\n");
        }

        System.out.print(sb);
    }
}
