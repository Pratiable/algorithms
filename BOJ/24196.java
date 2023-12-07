import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while (idx < str.length()) {
            char now = str.charAt(idx);
            sb.append(now);
            idx += now - 'A' + 1;
        }

        System.out.println(sb);
    }
}