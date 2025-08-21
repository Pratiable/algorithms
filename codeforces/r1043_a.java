import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            String a = br.readLine();

            int m = Integer.parseInt(br.readLine());
            String b = br.readLine();
            String c = br.readLine();

            for (int i = 0; i < m; i++) {
                if (c.charAt(i) == 'V') {
                    a = String.format("%s%s", b.charAt(i), a);
                } else {
                    a = String.format("%s%s", a, b.charAt(i));
                }
            }

            sb.append(a).append("\n");
        }

        System.out.println(sb);
    }
}
