import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int S = Integer.parseInt(br.readLine());
            if (S == 0) break;
            sb.append(S);

            while (S >= 10) {
                int cur = 1;
                int prev = S;

                while (prev > 0) {
                    cur *= (prev % 10);
                    prev /= 10;
                }

                S = cur;

                sb.append(" ").append(S);
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
