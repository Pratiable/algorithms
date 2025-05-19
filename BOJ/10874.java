import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean isPerfect = true;
            for (int j = 0; j < 10; j++) {
                int now = Integer.parseInt(st.nextToken());
                if (now != j % 5 + 1) isPerfect = false;
            }

            if (isPerfect) sb.append(i + 1).append("\n");
        }

        System.out.println(sb);
    }
}
