import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int t = 0; t < N; t++) {
            String str = br.readLine().toLowerCase();
            StringBuilder missing = new StringBuilder();
            boolean[] visited = new boolean[26];
            boolean canMake = true;

            for (int i = 0; i < str.length(); i++) {
                char cur = str.charAt(i);

                if (cur >= 'a' && cur <= 'z') {
                    visited[cur - 'a'] = true;
                }
            }
            
            for (int j = 0; j < 26; j++) {
                if (!visited[j]) {
                    canMake = false;
                    missing.append((char)('a' + j));
                }
            }

            if (canMake) {
                sb.append("pangram\n");
            } else {
                sb.append("missing ").append(missing).append("\n");
            }
        }

        System.out.print(sb);
    }
}
