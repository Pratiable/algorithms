import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long[] p = new long[101];
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        p[4] = 2;
        for (int i = 5; i < 101; i++) {
            p[i] = p[i - 1] + p[i - 5];
        }
        for (int i = 0; i < t; i++) {
            sb.append(p[Integer.parseInt(br.readLine())]).append("\n");
        }

        System.out.println(sb);
    }
}