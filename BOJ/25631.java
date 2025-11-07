import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            int cnt = map.getOrDefault(a, 0) + 1;

            map.put(a, cnt);
            max = Math.max(cnt, max);
        }

        System.out.print(max);
    }
}
