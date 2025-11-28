import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = n;
        int b = m;

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        System.out.printf("%d:%d", n / a, m / a);
    }
}
