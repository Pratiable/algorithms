import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        int as = 0;
        for (char c : a.toCharArray()) {
            as += (c - '0');
        }
        int aw = a.length() * as;

        int bs = 0;
        for (char c : b.toCharArray()) {
            bs += (c - '0');
        }
        int bw = b.length() * bs;

        if (aw > bw) {
            System.out.println(1);
        } else if (aw < bw) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}