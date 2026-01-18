import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < C; i++) {
            String str = br.readLine();
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                if (j + 5 <= str.length() && str.startsWith("while", j)) {
                    cnt++;
                    j += 4;
                } else if (j + 3 <= str.length() && str.startsWith("for", j)) {
                    cnt++;
                    j += 2;
                }
            }

            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}
