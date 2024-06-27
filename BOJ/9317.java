import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            Double a = Double.parseDouble(st.nextToken());
            Double b = Double.parseDouble(st.nextToken());
            Double c = Double.parseDouble(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            sb.append(String.format("Horizontal DPI: %.2f\n", b / ((16 * a) / Math.sqrt(337))));
            sb.append(String.format("Vertical DPI: %.2f\n", c / (9 * ((16 * a) / Math.sqrt(337)) / 16)));
        }

        System.out.println(sb);
    }
}
