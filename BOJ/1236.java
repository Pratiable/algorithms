import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] col = new int[n];
        int[] row = new int[m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'X') {
                    row[j] = 1;
                    col[i] = 1;
                }
            }
        }

        int colNeed = 0;
        int rowNeed = 0;
        for (int c : col) {
            if (c == 0) colNeed++;
        }
        for (int r : row) {
            if (r == 0) rowNeed++;
        }

        System.out.println(Math.max(colNeed, rowNeed));

        bw.flush();
        bw.close();
    }
}