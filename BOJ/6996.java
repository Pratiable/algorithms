import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            Map<Character, Integer> map = new HashMap<>();
            String A = st.nextToken();
            String B = st.nextToken();

            if (A.length() != B.length()) {
                sb.append(A).append(" & ").append(B).append(" are NOT anagrams.\n");
                continue;
            }

            for (char c : A.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : B.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) - 1);
            }

            boolean isSame = true;

            for (int v : map.values()) {
                if (v != 0) {
                    isSame = false;
                    break;
                }
            }

            sb.append(A).append(" & ").append(B).append(isSame ? " are anagrams.\n" : " are NOT anagrams.\n");
        }

        System.out.print(sb);
    }
}
