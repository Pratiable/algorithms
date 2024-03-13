import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int sum = 0;
            String str = br.readLine();
            boolean[] alps = new boolean[26];

            for (int i = 0; i < str.length(); i++) {
                alps[str.charAt(i) - 'A'] = true;
            }

            for (int i = 0; i < 26; i++) {
                if (!alps[i]) sum += i + 65;
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}