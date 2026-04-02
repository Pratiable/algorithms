import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            String[] songs = new String[n];
            for (int i = 0; i < n; i++) {
                songs[i] = br.readLine();
            }

            Arrays.sort(songs, String.CASE_INSENSITIVE_ORDER);

            sb.append(t++).append("\n");

            for (int i = 0; i < n; i++) {
                sb.append(songs[i]).append('\n');
            }
        }

        System.out.print(sb);
    }
}
