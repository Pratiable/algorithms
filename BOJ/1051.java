import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n == 1 || m == 1) {
            System.out.println(1);
            return;
        }
        int max = 1;
        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char target = map[i][j];
                    for (int l = j + 1; l < m; l++) {
                        if (target == map[i][l]) {
                            int gap = l - j;
                            if (gap < Math.sqrt(max)) continue;
                            if (n <= i + gap) continue;
                            if (target == map[i + gap][j] && target == map[i + gap][l]) {
                                max = (int) Math.pow(gap + 1, 2);
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
