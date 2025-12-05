import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int P = Integer.parseInt(br.readLine());

        String[] cases = {
                "TTT",
                "TTH",
                "THT",
                "THH",
                "HTT",
                "HTH",
                "HHT",
                "HHH"
        };

        for (int t = 0; t < P; t++) {
            String str = br.readLine();
            int[] cnt = new int[8];

            for (int i = 0; i <= 37; i++) {
                String cur = str.substring(i, i + 3);

                for (int j = 0; j < 8; j++) {
                    if (cur.equals(cases[j])) cnt[j]++;
                }
            }

            for (int i = 0; i < 8; i++) {
                sb.append(cnt[i]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
