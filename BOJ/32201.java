import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] f = new int[n];
        int[] s = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            f[i] = Integer.parseInt(st.nextToken());
            map.put(f[i], i + 1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
            int gap = map.get(s[i]) - (i + 1);
            max = Math.max(max, gap);
            map.put(s[i], gap);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(s[i]) == max) {
                sb.append(s[i]).append(" ");
            }
        }

        System.out.println(sb);
    }
}
