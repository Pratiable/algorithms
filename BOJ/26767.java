import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                sb.append("Wiwat!\n");
            } else if (i % 7 == 0) {
                sb.append("Hurra!\n");
            } else if (i % 11 == 0) {
                sb.append("Super!\n");
            } else {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
