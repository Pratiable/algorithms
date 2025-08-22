import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        boolean hasMany = false;
        int max = 0;
        String frequentTag = "";

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            st.nextToken();

            while (st.hasMoreTokens()) {
                String tag = st.nextToken();
                map.put(tag, map.getOrDefault(tag, 0) + 1);
            }
        }

        for (String tag: map.keySet()) {
            int tagCount = map.get(tag);
            if (tagCount > max) {
                max = tagCount;
                frequentTag = tag;
                hasMany = false;
            } else if (tagCount == max) {
                hasMany = true;
            }
        }

        System.out.println(hasMany ? -1 : frequentTag);
    }
}