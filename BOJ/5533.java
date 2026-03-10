import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                boolean canEarn = true;

                for (int k = 0; k < N; k++) {
                    if (i == k) continue;
                    if (arr[i][j] == arr[k][j]) {
                        canEarn = false;
                        break;
                    }
                }

                if (canEarn) {
                    sum += arr[i][j];
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
