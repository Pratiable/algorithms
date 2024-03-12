import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String str = br.readLine();
            if (str.charAt(str.length() / 2 - 1) == str.charAt(str.length() / 2)) {
                sb.append("Do-it\n");
            } else {
                sb.append("Do-it-Not\n");
            }
        }

        System.out.println(sb);
    }
}