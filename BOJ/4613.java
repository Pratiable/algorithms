import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while (true) {
            str = br.readLine();
            if (str.equals("#")) break;

            int sum = 0;

            for (int i = 1; i < str.length() + 1; i++) {
                char cur = str.charAt(i - 1);

                if (cur != ' ') {
                    sum += i * (cur - 'A' + 1);
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
