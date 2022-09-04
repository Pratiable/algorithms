import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long rc, cc;

        if (r % n != 0) {
            rc = r / n + 1;
        } else {
            rc = r / n;
        }

        if (c % n != 0) {
            cc = c / n + 1;
        } else {
            cc = c / n;
        }

        System.out.println(rc * cc);
    }
}