import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while (true) {
            s = br.readLine();
            if (s.equals("#")) break;

            int vowel = -1;
            for (int i = 0; i < s.length(); i++) {
                char cur = s.charAt(i);

                if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u') {
                    vowel = i;
                    break;
                }
            }

            if (vowel == -1) {
                sb.append(s).append("ay");
            } else {
                sb.append(s.substring(vowel)).append(s, 0, vowel).append("ay");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
