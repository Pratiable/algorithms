import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i] = br.readLine();
            }
            int changedCount = 0;

            for (int i = 1; i < n; i++) {
                if (names[i - 1].compareTo(names[i]) > 0) {
                    names[i] = names[i - 1];
                    changedCount++;
                }
            }

            sb.append("Case #").append(t + 1).append(": ").append(changedCount).append("\n");
        }

        System.out.println(sb);
    }
}