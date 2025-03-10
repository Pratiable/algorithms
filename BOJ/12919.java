import java.io.*;
import java.util.*;

public class Main {
    static String s, t;
    static boolean isMade = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().trim();
        t = br.readLine().trim();

        make(t);

        System.out.println(isMade ? 1 : 0);
    }

    public static void make(String str) {
        if (str.equals(s)) {
            isMade = true;
            return;
        }

        if (str.length() <= s.length()) return;

        if (str.charAt(str.length() - 1) == 'A') {
            make(str.substring(0, str.length() - 1));
        }

        if (str.charAt(0) == 'B') {
            StringBuilder sb = new StringBuilder(str).reverse();
            make(sb.substring(0, str.length() - 1));
        }
    }
}