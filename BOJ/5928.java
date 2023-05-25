import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int sd = 11;
        int sh = 11;
        int sm = 11;

        int end = (d - 1) * 24 * 60 + h * 60 + m;
        int start = (sd - 1) * 24 * 60 + sh * 60 + sm;

        int spent = end - start;

        if (spent < 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(spent);
    }
}
