import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(3 * n)).append(" ".repeat(n)).append("@".repeat(n)).append("\n");
        }

        for (int i = 0; i < n * 3; i++) {
            sb.append("@".repeat(n)).append(" ".repeat(n)).append("@".repeat(n)).append(" ".repeat(n)).append("@".repeat(n)).append("\n");
        }

        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n)).append(" ".repeat(n)).append("@".repeat(n * 3)).append("\n");
        }

        System.out.println(sb);
    }
}