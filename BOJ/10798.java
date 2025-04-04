import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] map = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            Arrays.fill(map[i], '-');

            for (int j = 0; j < str.length(); j++) {
                map[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (map[j][i] == '-') {
                    continue;
                }

                sb.append(map[j][i]);
            }
        }

        System.out.println(sb);
    }
}