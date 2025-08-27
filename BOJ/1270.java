import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            int Ti = Integer.parseInt(st.nextToken());
            Map<Long, Integer> map = new HashMap<>();
            boolean isOccupied = false;
            long s = -1;

            for (int j = 0; j < Ti; j++) {
                long soldier = Long.parseLong(st.nextToken());
                map.put(soldier, map.getOrDefault(soldier, 0) + 1);
            }

            for (long soldier : map.keySet()) {
                if (map.get(soldier) > Ti / 2) {
                    isOccupied = true;
                    s = soldier;
                    break;
                }
            }

            sb.append(isOccupied ? s : "SYJKGW").append("\n");
        }

        System.out.println(sb);
    }
}
