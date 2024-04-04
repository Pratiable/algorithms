import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] f = new String[n];
        String[] s = new String[m];

        for (int i = 0; i < n; i++) {
            f[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            s[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(String.format("%s as %s\n", f[i], s[j]));
            }
        }

        System.out.println(sb);
    }
}