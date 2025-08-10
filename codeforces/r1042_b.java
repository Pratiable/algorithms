import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int T = 0; T < t; T++) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n - 1; i++) {
                sb.append(i % 2 == 0 ? -1 : 3).append(" ");
            }

            sb.append(n % 2 == 0 ? 2 : -1).append("\n");
        }

        System.out.println(sb);
    }
}