import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            boolean[] visited = new boolean[26];
            boolean canMake = true;
            if (str.equals("*")) break;

            for (int i = 0; i < str.length(); i++) {
                char cur = str.charAt(i);

                if ('a' <= cur && cur <= 'z') {
                    visited[cur - 'a'] = true;
                }
            }

            for (int i = 0; i < 26; i++) {
                if (!visited[i]) {
                    canMake = false;
                    break;
                }
            }

            sb.append(canMake ? "Y\n" : "N\n");
        }

        System.out.print(sb);
    }
}
