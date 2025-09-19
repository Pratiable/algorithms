import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int J = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == ' ') {
                    sum += 1;
                } else if (('a' <= c && c <= 'z') || ('0' <= c && c <= '9')) {
                    sum += 2;
                } else if ('A' <= c && c <= 'Z') {
                    sum += 4;
                }
            }

            if (sum <= J) {
                count++;
            }
        }

        System.out.print(count);
    }
}
