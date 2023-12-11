import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double A1 = Double.parseDouble(st.nextToken());
            double P1 = Double.parseDouble(st.nextToken());

            st = new StringTokenizer(br.readLine());
            double R1 = Double.parseDouble(st.nextToken());
            double P2 = Double.parseDouble(st.nextToken());

            double s = A1 / P1;
            double w = Math.PI * R1 * R1 / P2;

            sb.append(w > s ? "Whole pizza" : "Slice of pizza").append("\n");
        }

        System.out.println(sb);
    }
}
