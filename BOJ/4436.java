import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            long num = n;
            boolean[] visited = new boolean[10];
            int k = 1;

            while (true) {
                String number = String.valueOf(num);
                for (int i = 0; i < number.length(); i++) {
                    visited[number.charAt(i) - '0'] = true;
                }

                boolean isClear = true;

                for (int i = 0; i < 10; i++) {
                    if (!visited[i]) {
                        isClear = false;
                        break;
                    }
                }

                if (isClear) {
                    sb.append(k).append("\n");
                    break;
                }

                k++;
                num += n;
            }
        }

        System.out.println(sb);
    }
}