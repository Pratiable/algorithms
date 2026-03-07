import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int solved = 0;
        int pen = 0;

        while (true) {
            str = br.readLine();
            if (str.equals("-1")) break;

            st = new StringTokenizer(str);
            int time = Integer.parseInt(st.nextToken());
            String prob = st.nextToken();
            String res = st.nextToken();

            if (set.contains(prob)) continue;

            if (res.equals("right")) {
                pen += time + map.getOrDefault(prob, 0) * 20;
                set.add(prob);
                solved++;
            } else {
                map.put(prob, map.getOrDefault(prob, 0) + 1);
            }
        }

        System.out.print(solved + " " + pen);
    }
}
