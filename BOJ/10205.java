import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            String action = br.readLine();

            for (int i = 0 ; i < action.length() ; i++) {
                char cmd = action.charAt(i);
                if (cmd == 'c') {
                    n++;
                    continue;
                }
                n--;
            }

            sb.append("Data Set ").append(t).append(":\n").append(n).append("\n\n");
        }

        System.out.println(sb);
    }
}