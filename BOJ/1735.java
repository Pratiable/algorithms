import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int numerator = A * D + B * C;
        int denominator = B * D;
        int gcd = gcd(numerator, denominator);

        numerator /= gcd;
        denominator /= gcd;

        System.out.printf("%d %d", numerator, denominator);
    }

    static int gcd(int x, int y) {
        int tmp;
        
        while (y != 0) {
            tmp = x % y;
            x = y;
            y = tmp;
        }
        
        return x;
    }
}
