import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (a.equals("ChongChong") || b.equals("ChongChong")) {
                set.add(a);
                set.add(b);
                continue;
            }

            if (set.contains(a) || set.contains(b)) {
                set.add(a);
                set.add(b);
            }
        }

        System.out.println(set.size());
    }
}

