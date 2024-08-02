import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String str = br.readLine();
            int a = 0;
            int b = 0;

            for (char c : str.toCharArray()) {
                if (c == 'a') {
                    a++;
                } else {
                    b++;
                }
            }
            sb.append(Math.min(a, b)).append("\n");
        }

        System.out.println(sb);
    }
}