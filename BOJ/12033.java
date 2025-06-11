import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] prices = new int[n * 2];
            for (int i = 0; i < n * 2; i++) {
                int price = Integer.parseInt(st.nextToken());
                prices[i] = price;
                map.put(price, map.getOrDefault(price, 0) + 1);
            }

            sb.append("Case #").append(t + 1).append(": ");

            for (int price : prices) {
                int remain = map.get(price);
                if (remain == 0) continue;
                map.put(price, map.get(price) - 1);
                map.put(price + price / 3, map.get(price + price / 3) - 1);
                sb.append(price).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
