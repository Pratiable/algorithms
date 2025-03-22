import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long r = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long range = k - 1;
        while (true) {
            if (m <= range || r == 0) {
                System.out.println(r);
                return;
            }

            r = (long) Math.floor((double) r / 2);
            range += k;
        }
    }
}
