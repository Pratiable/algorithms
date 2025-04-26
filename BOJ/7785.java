import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Map<String, Boolean> map = new HashMap<>();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, true);
            }
        }

        List<String> names = new ArrayList<>(map.keySet());

        names.sort(Comparator.reverseOrder());

        for (String name: names) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}