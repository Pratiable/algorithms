import java.io.*;
import java.util.*;

public class Main {
    static int[] d = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        dp(0);

        for (int i = 0; i < t; i++) {
            int x = Integer.parseInt(br.readLine());
            sb.append(d[x]).append("\n");
        }

        System.out.println(sb);
    }

    static void dp(int num) {
        if (num > 10) {
            return;
        }

        d[num]++;

        for (int i = 1; i < 4; i++) {
            dp(num + i);
        }
    }
}