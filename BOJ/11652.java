import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        long maxNum = 0;
        int max = 0;
        for (Map.Entry<Long, Integer> now : map.entrySet()) {
            long num = now.getKey();
            int cnt = now.getValue();
            if (cnt > max || (cnt == max && num < maxNum)) {
                max = cnt;
                maxNum = num;
            }
        }

        System.out.println(maxNum);
    }
}
