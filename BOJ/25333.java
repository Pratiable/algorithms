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
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            long X = Long.parseLong(st.nextToken());

            while (B != 0) {
                long tmp  = B;
                B = A % B;
                A = tmp;
            }

            sb.append(X / A).append("\n");
        }

        System.out.println(sb);
    }
}
