import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            long sum = (m - n + 1) * (n + m) / 2;

            sb.append("Scenario #").append(t).append(":\n");
            sb.append(sum).append("\n\n");
        }

        System.out.print(sb);
    }
}