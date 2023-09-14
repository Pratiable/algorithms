import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0 || n == 1) {
            System.out.println(0);
            return;
        }

        BigInteger num = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }

        String str = num.toString();

        int cnt = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                cnt++;
                continue;
            }
            break;
        }

        System.out.println(cnt);
    }
}