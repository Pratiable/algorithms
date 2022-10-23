import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        if (num.length() == 1) {
            System.out.println("NO");
            return;
        }
        StringBuilder now = new StringBuilder(String.valueOf(num.charAt(0)));

        for (int i = 1; i < num.length(); i++) {
            String rest = num.substring(i);
            int first = 1;
            int second = 1;
            for (int j = 0; j < now.length(); j++) {
                first *= Integer.parseInt(String.valueOf(now.charAt(j)));
            }
            for (int k = 0; k < rest.length(); k++) {
                second *= Integer.parseInt(String.valueOf(rest.charAt(k)));
            }
            if (first == second) {
                System.out.println("YES");
                return;
            }
            now.append(rest.charAt(0));
        }
        System.out.println("NO");
    }
}