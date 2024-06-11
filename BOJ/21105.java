import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            double p = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());

            sb.append(String.format("%.9f", (p * 100) / (100 + c))).append("\n");
        }

        System.out.println(sb);
    }
}