import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            long sqrt = (long) Math.sqrt(N);

            sb.append(sqrt * sqrt == N ? 1 : 0).append("\n");
        }

        System.out.print(sb);
    }
}
