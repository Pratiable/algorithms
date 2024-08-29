import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] cnts = new int[1001];

            for (int i = 0; i < n; i++) {
                cnts[Integer.parseInt(br.readLine())]++;
            }

            int max = Integer.MIN_VALUE;
            int num = 0;

            for (int i = 0; i < cnts.length; i++) {
                if (cnts[i] > max) {
                    max = cnts[i];
                    num = i;
                }
            }

            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}