import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] map = new String[10][10];

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                map[i][j] = st.nextToken();
            }
        }

        Loop:
        for (int i = 0; i < 10; i++) {
            String std = map[i][0];
            for (int j = 1; j < 10; j++) {
                if (!Objects.equals(std, map[i][j])) continue Loop;
            }
            System.out.println(1);
            return;
        }

        Loop:
        for (int i = 0; i < 10; i++) {
            String std = map[0][i];
            for (int j = 1; j < 10; j++) {
                if (!Objects.equals(std, map[j][i])) continue Loop;
            }
            System.out.println(1);
            return;
        }

        System.out.println(0);
    }
}