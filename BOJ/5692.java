import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        int[] factorials = new int[6];
        factorials[0] = 1;

        for (int i = 1; i < 6; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        while (true) {
            str = br.readLine();
            if (str.equals("0")) break;
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                sum += (str.charAt(i) - '0') * factorials[str.length() - i];
            }

            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }
}