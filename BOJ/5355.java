import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            while (st.hasMoreTokens()) {
                String cmd = st.nextToken();

                switch (cmd) {
                    case "@":
                        num *= 3;
                        break;
                    case "%":
                        num += 5;
                        break;
                    case "#":
                        num -= 7;
                        break;
                }
            }

            sb.append(String.format("%.2f\n", num));
        }

        System.out.print(sb);
    }
}
