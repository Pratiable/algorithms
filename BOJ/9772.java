import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());

            if (a == 0 && b == 0) break;

            if (a == 0 || b == 0) {
                sb.append("AXIS");
            } else if (a > 0 && b > 0) {
                sb.append("Q1");
            } else if (a < 0 && b > 0) {
                sb.append("Q2");
            } else if (a < 0 && b < 0) {
                sb.append("Q3");
            } else {
                sb.append("Q4");
            }
            sb.append("\n");
        }
        sb.append("AXIS");
        System.out.println(sb);
    }
}
