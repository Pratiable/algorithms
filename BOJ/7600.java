import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        boolean[] visited;

        while (true) {
            str = br.readLine();
            int cnt = 0;
            if (str.equals("#")) break;

            str = str.toLowerCase();
            visited = new boolean[26];

            for (int i = 0; i < str.length(); i++) {
                char cur = str.charAt(i);

                if (cur >= 'a' && cur <= 'z') {
                    visited[cur - 'a'] = true;
                }
            }

            for (int i = 0; i < 26; i++) {
                if (visited[i]) cnt++;
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
