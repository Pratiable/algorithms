import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int S = Integer.parseInt(br.readLine());

        for (int t = 0; t < S; t++) {
            String str = br.readLine().toLowerCase();
            int l = 0;
            int v = 0;

            for (int i = 0; i < str.length(); i++) {
                char cur = str.charAt(i);
                
                if (cur == ' ') continue;
                if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u') {
                    v++;
                } else {
                    l++;
                }
            }

            sb.append(l).append(" ").append(v).append("\n");
        }

        System.out.print(sb);
    }
}
