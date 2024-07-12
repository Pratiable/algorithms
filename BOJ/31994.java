import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int n = 0;
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ns = st.nextToken();
            int np = Integer.parseInt(st.nextToken());
            if (np > n) {
                n = np;
                str = ns;
            }
        }

        System.out.println(str);
    }
}