import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            int sum = 0;

            for (int j = 0; j < str.length(); j++) {
                char cur = str.charAt(j);

                if (cur != ' ') {
                    sum += cur - 'A' + 1;
                }
            }

            sb.append(sum == 100 ? "PERFECT LIFE" : sum).append("\n");
        }

        System.out.print(sb);
    }
}
