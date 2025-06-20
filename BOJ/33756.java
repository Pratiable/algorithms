import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int count = 0;
            String num = br.readLine();
            long r = Long.parseLong(num);
            long eights = Long.parseLong("8".repeat(num.length()));

            while (true) {
                if (r >= eights) {
                    r -= eights;
                    count++;
                } else {
                    eights -= 8;
                    eights /= 10;
                }

                if (r == 0 || eights == 0 || count == 8) break;
            }

            sb.append(r == 0 ? "Yes\n" : "No\n");
        }

        System.out.println(sb);
    }
}