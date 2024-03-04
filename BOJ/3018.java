import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        boolean[][] people = new boolean[n + 1][e];
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < e; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int[] prts = new int[k];
            for (int i = 0; i < k; i++) {
                prts[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(prts);

            if (prts[0] == 1) {
                for (int j = 0; j < k; j++) {
                    people[prts[j]][t] = true;
                }
                continue;
            }

            for (int j = 0; j < k; j++) {
                for (int l = 0; l < e; l++) {
                    if (people[prts[j]][l]) {
                        for (int m = 0; m < k; m++) {
                            if (m == j) continue;
                            people[prts[m]][l] = true;
                        }
                    }
                }
            }
        }

        sb.append(1).append("\n");

        Loop:
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < e; j++) {
                if (people[1][j] != people[i][j]) continue Loop;
            }

            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}