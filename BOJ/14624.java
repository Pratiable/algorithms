import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        if (N % 2 == 0) {
            System.out.println("I LOVE CBNU");
            return;
        }

        sb.append("*".repeat(Math.max(0, N))).append("\n");

        for (int i = 0; i < N / 2 + 1; i++) {
            sb.append(" ".repeat(Math.max(0, N / 2 - i))).append("*");

            if (i > 0) {
                sb.append(" ".repeat(2 * i - 1)).append("*");
            }

            if (i < N / 2) sb.append("\n");
        }

        System.out.print(sb);
    }
}
