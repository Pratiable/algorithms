import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int rank = Integer.parseInt(br.readLine());
            sb.append("Case #" + (t + 1) + ": ");

            if (rank <= 25) {
                sb.append("World Finals\n");
            } else if (rank <= 1000) {
                sb.append("Round 3\n");
            } else if (rank <= 4500) {
                sb.append("Round 2\n");
            } else {
                sb.append("Round 1\n");
            }
        }

        System.out.println(sb);
    }
}
