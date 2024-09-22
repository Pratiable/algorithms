import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = br.readLine();
        }

        int r = Integer.parseInt(br.readLine());
        for (int i = 0; i < r; i++) {
            int now = Integer.parseInt(br.readLine());
            sb.append("Rule ").append(now).append(": ");

            if (now > 0 && now < n + 1) {
                sb.append(strs[now - 1]).append("\n");
            } else {
                sb.append("No such rule").append("\n");
            }
        }

        System.out.println(sb);
    }
}