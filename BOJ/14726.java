import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String s = br.readLine();
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                int n = s.charAt(i) - '0';

                if ((i + 1) % 2 == 1) {
                    n *= 2;

                    if (n >= 10) {
                        n = n / 10 + n % 10;
                    }
                }

                sum += n;
            }

            sb.append(sum % 10 == 0 ? "T\n" : "F\n");
        }

        System.out.print(sb);
    }
}
