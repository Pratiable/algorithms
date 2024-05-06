import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[][] cards = new boolean[4][14];

        for (int i = 0; i < 51; i++) {
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            switch (d) {
                case "S":
                    cards[0][n] = true;
                    break;
                case "B":
                    cards[1][n] = true;
                    break;
                case "V":
                    cards[2][n] = true;
                    break;
                case "K":
                    cards[3][n] = true;
                    break;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                if (!cards[i][j]) {
                    System.out.printf("%s %d", i == 0 ? "S" : i == 1 ? "B" : i == 2 ? "V" : "K", j);
                    return;
                }
            }
        }

    }
}