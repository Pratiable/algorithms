import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] cards = new int[21];

        for (int i = 1; i <= 20; i++) {
            cards[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cnt = (b - a + 1) / 2;

            for (int j = 0; j < cnt; j++) {
                int tmp = cards[a + j];

                cards[a + j] = cards[b - j];
                cards[b - j] = tmp;
            }
        }

        for (int i = 1; i <= 20; i++) {
            sb.append(cards[i]).append(" ");
        }

        System.out.print(sb);
    }
}
