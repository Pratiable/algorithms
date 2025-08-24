import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(f(A, B, C));
    }

    static long f(long a, long b, long c) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a % c;
        }

        long k = f(a, b / 2, c);

        if (b % 2 == 0) {
            return k * k % c;
        }

        return k * k % c * a % c;
    }
}
