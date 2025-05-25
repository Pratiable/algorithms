import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        String t = br.readLine();
        boolean[] exclude = new boolean[26];

        for (char ch : s.toCharArray()) {
            exclude[ch - 'a'] = true;
        }

        for (char ch : t.toCharArray()) {
            if (!exclude[ch - 'a']) sb.append(ch);
        }

        System.out.println(sb);
    }
}
