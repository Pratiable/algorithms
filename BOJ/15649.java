import java.io.*;
import java.util.*;

public class Main {
    public static HashSet<String> set = new HashSet<>();
    public static HashMap<Integer, Boolean> map = new HashMap<>();
    public static StringBuilder sb = new StringBuilder();
    public static int n;
    public static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        make("", 0);

        System.out.println(sb);
    }

    public static void make(String num, int count) {
        if (count == m) {
            sb.append(num).append("\n");
            return;
        }
        for (int j = 1; j <= n; j++) {
            if (map.containsKey(j) && map.get(j)) continue;
            map.put(j, true);
            make(num + String.format("%d ", j), count + 1);
            map.put(j, false);
        }
    }
}