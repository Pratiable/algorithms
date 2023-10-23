import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        long r = 0;

        for (int i = 0; i < a.length(); i++) {
            long n = a.charAt(i) - '0';
            for (int j = 0; j < b.length(); j++) {
                r += n * (b.charAt(j) - '0');
            }
        }

        System.out.println(r);
    }
}
