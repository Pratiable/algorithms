import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String num = br.readLine();
            StringBuilder sb2 = new StringBuilder();
            int start = 0;

            while (start < num.length()) {
                char cur = num.charAt(start);
                int end = start;
                while (end < num.length() && num.charAt(end) == cur) end++;

                sb2.append(end - start).append(cur);
                start = end;
            }

            sb.append(sb2).append("\n");
        }

        System.out.print(sb);
    }
}
