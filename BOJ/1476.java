import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int te = Integer.parseInt(st.nextToken());
        int ts = Integer.parseInt(st.nextToken());
        int tm = Integer.parseInt(st.nextToken());

        int e = 1;
        int s = 1;
        int m = 1;

        int y = 1;

        while (true) {
            if (te == e && ts == s && tm == m) {
                break;
            }
            e++;
            s++;
            m++;

            if (e == 16) e = 1;
            if (s == 29) s = 1;
            if (m == 20) m = 1;
            y++;
        }

        System.out.println(y);
    }
}