import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();

            String title = st.nextToken();
            String key = st.nextToken() + st.nextToken() + st.nextToken();

            if (map.containsKey(key)) {
                map.get(key).add(title);
            } else {
                map.put(key, new ArrayList<>());
                map.get(key).add(title);
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken() + st.nextToken() + st.nextToken();

            if (map.containsKey(key)) {
                 if (map.get(key).size() == 1) {
                     sb.append(map.get(key).get(0)).append("\n");
                 } else if (map.get(key).size() > 1) {
                    sb.append("?\n");
                }
            } else {
                sb.append("!\n");
            }
        }

        System.out.println(sb);
    }
}