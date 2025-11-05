import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = 0;
        sb.append(0).append(" ");


        for (int i = 1; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());

            max = Math.max(max, A - min);
            min = Math.min(min, A);

            sb.append(max).append(" ");
        }

        System.out.print(sb);
    }
}
