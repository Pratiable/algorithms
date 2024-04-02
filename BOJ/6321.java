import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String now = br.readLine();

            sb.append("String #").append(i + 1).append("\n");

            for (int j = 0; j < now.length(); j++) {
                sb.append(now.charAt(j) - 'A' != 25 ? (char) (now.charAt(j) + 1) : 'A');
            }

            sb.append("\n\n");
        }

        System.out.println(sb);
    }
}