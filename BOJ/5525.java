import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String p = "I" + "OI".repeat(n);
        int cnt = 0;

        for (int i = 0; i < m - p.length() + 1; i++) {
            if (str.startsWith(p, i)) {
                cnt++;
                int ns = i + p.length();
                while (ns < m - 1) {
                    if (str.charAt(ns) == 'O' && str.charAt(ns + 1) == 'I') {
                        cnt++;
                        ns += 2;
                    } else {
                        break;
                    }
                }
                i = ns - 1;
            }
        }

        System.out.println(cnt);
    }
}
