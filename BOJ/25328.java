import java.io.*;
import java.util.*;

public class Main {
    static String[] strs;
    static HashSet<String> set;
    static int k, idx;
    static char[] ans;
    static boolean[] visited;
    static HashMap<String, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strs = new String[3];
        for (int i = 0; i < 3; i++) {
            strs[i] = br.readLine();
        }
        k = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        set = new HashSet<>();
        for (int j = 0; j < 3; j ++) {
            ans = new char[k];
            idx = j;
            visited = new boolean[strs[idx].length()];
            make(0, 0);
        }

        String[] result = set.toArray(new String[0]);
        Arrays.sort(result);

        if (result.length == 0) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int l = 0; l < result.length; l++) {
                sb.append(result[l]).append("\n");
            }
            System.out.println(sb);
        }
    }

    static void make(int depth, int index) {
        if (depth == k) {
            String str = new String(ans);
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                set.add(str);
            }
            return;
        }

        for (int m = index; m < strs[idx].length(); m++) {
            if (visited[m]) continue;
            visited[m] = true;
            ans[depth] = strs[idx].charAt(m);
            make(depth + 1, m + 1);
            visited[m] = false;
        }
    }
}