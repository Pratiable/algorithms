import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());
            sb.append("++++ ".repeat(now / 5)).append("|".repeat(now % 5)).append("\n");
        }

        System.out.println(sb);
    }
}
