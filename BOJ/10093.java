import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long max = Math.max(A, B);
        long min = Math.min(A, B);

        sb.append(Math.max(max - min - 1, 0)).append("\n");

        if (max - min - 1 > 0) {
            for (long i = min + 1; i < max; i++) {
                sb.append(i).append(" ");
            }
        }

        System.out.print(sb);
    }
}
