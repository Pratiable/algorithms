import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        if (n != 1) sb.append(" ".repeat(n - 1)).append("*\n");
        for (int i = 1; i < n - 1; i++) {
            sb.append(" ".repeat(n - (i + 1))).append("*").append(" ".repeat(2 * i - 1)).append("*").append("\n");
        }
        sb.append("*".repeat(2 * n - 1));
        System.out.println(sb);
    }
}