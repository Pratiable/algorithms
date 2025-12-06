import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int d = Integer.parseInt(br.readLine());
            int max = 0;
            
            while (Math.pow(max, 2) + max <= d) {
                max++;
            }

            sb.append(max - 1).append("\n");
        }

        System.out.print(sb);
    }
}
