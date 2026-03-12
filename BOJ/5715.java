import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        Map<Character, Integer> notes = new HashMap<>();
        notes.put('W', 64);
        notes.put('H', 32);
        notes.put('Q', 16);
        notes.put('E', 8);
        notes.put('S', 4);
        notes.put('T', 2);
        notes.put('X', 1);

        while (true) {
            str = br.readLine();
            if (str.equals("*")) break;
            int cnt = 0;
            int len = 0;

            for (int i = 1; i < str.length(); i++) {
                char cur = str.charAt(i);
                if (cur == '/') {
                    if (len == 64) cnt++;
                    len = 0;
                } else {
                    len += notes.get(cur);
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
