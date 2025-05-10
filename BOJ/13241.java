import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long x = a;
        long y = b;
        while (y != 0) {
            long tmp = y;
            y = x % y;
            x = tmp;
        }

        System.out.println(a / x * b);
    }
}
