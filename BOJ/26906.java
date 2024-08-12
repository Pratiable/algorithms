import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            String b = st.nextToken();
            map.put(b, str);
        }

        String str = br.readLine();

        for (int i = 0; i < str.length(); i += 4) {
            String now = str.substring(i, i + 4);
            sb.append(map.getOrDefault(now, "?"));
        }

        System.out.println(sb);
    }
}