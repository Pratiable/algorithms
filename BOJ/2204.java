import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            if (n == 0) break;

            String first = br.readLine();

            for (int i = 1; i < n; i++) {
                String word = br.readLine();
                if (word.toLowerCase().compareTo(first.toLowerCase()) < 0) {
                    first = word;
                }
            }

            sb.append(first).append("\n");
        }

        System.out.print(sb);
    }
}
