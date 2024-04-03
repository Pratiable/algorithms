import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String prev = "right";

        while (true) {
            String str = br.readLine();
            int a = str.charAt(0) - '0';
            int b = str.charAt(1) - '0';
            String cnt = str.substring(2);
            int sum = a + b;
            if (str.equals("99999")) break;

            if (sum == 0) {
            } else if (sum % 2 == 0) {
                prev = "right";
            } else {
                prev = "left";
            }

            sb.append(prev).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}