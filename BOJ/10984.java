import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int sumC = 0;
            double sumG = 0.0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int C = Integer.parseInt(st.nextToken());
                double G = Double.parseDouble(st.nextToken());

                sumC += C;
                sumG += C * G;
            }

            sb.append(sumC).append(" ").append(String.format("%.1f", sumG / sumC)).append("\n");
        }

        System.out.print(sb);
    }
}
