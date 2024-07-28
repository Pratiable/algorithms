import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            sb.append(n).append(" => ").append((int) Math.pow(n, 2) - n + 1).append("\n");
        }

        System.out.println(sb);
    }
}