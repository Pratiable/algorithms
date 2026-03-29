import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < str.length() / K; j++) {
                int cur;

                if (j % 2 == 0) {
                    cur = i + j * K;
                } else {
                    cur = (K - 1 - i) + j * K;
                }

                sb.append(str.charAt(cur));
            }
        }

        System.out.print(sb);
    }
}
