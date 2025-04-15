import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        String maxString = "";
        String line;
        StringTokenizer st;
        StringBuilder sb;

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                if (word.equals("E-N-D")) break;
                int count = 0;
                sb = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    int now = word.charAt(i);
                    if (now == 45 || (now >= 65 && now <= 90) || (now >= 97 && now <= 122)) {
                        count++;
                        sb.append(word.charAt(i));
                    }
                }

                if (count > max) {
                    maxString = sb.toString();
                    max = count;
                }
            }
        }

        System.out.println(maxString.toLowerCase());
    }
}