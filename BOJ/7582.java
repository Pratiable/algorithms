import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            String rNumber = st.nextToken();
            int Z = Integer.parseInt(st.nextToken());

            if (rNumber.equals("#") && Z == 0) break;

            int P = Integer.parseInt(br.readLine());
            int S = Integer.parseInt(br.readLine());

            for (int i = 0; i < S; i++) {
                st = new StringTokenizer(br.readLine());
                int m = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());

                P -= m;
                P += Math.min(p, Z - P);
            }

            sb.append(rNumber).append(" ").append(P).append("\n");
        }

        System.out.print(sb);
    }
}
