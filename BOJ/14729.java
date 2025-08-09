import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        double[] scores = new double[N];

        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(scores);

        for (int i = 0; i < 7; i++) {
            sb.append(String.format("%.3f", scores[i])).append("\n");
        }

        System.out.println(sb);
    }
}
