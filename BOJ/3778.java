import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String f = br.readLine();
            String s = br.readLine();
            int[] cnt = new int[26];
            int dist = 0;

            for (int i = 0; i < f.length(); i++) {
                cnt[f.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s.length(); i++) {
                cnt[s.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                dist += Math.abs(cnt[i]);
            }

            sb.append("Case #").append(t + 1).append(": ").append(dist).append("\n");
        }

        System.out.print(sb);
    }
}
