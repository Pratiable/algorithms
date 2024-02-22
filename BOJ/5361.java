import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        double[] prices = {350.34, 230.90, 190.55, 125.30, 180.90};
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken()) * prices[0];
            double b = Double.parseDouble(st.nextToken()) * prices[1];
            double c = Double.parseDouble(st.nextToken()) * prices[2];
            double d = Double.parseDouble(st.nextToken()) * prices[3];
            double e = Double.parseDouble(st.nextToken()) * prices[4];

            sb.append(String.format("$%.2f\n", a + b + c + d + e));
        }

        System.out.println(sb);
    }
}