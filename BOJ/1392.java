import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < Q; i++) {
            int time = Integer.parseInt(br.readLine());
            int score = 0;

            for (int j = 0; j < N; j++) {
                score += scores[j];
                if (time < score) {
                    sb.append(j + 1).append("\n");
                    break;
                }
            }
        }

        System.out.print(sb);
    }
}
