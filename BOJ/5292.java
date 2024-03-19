import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sb.append("DeadMan\n");
            } else if (i % 3 == 0) {
                sb.append("Dead\n");
            } else if (i % 5 == 0) {
                sb.append("Man\n");
            } else {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }
}