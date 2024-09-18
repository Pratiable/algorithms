import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == 'J') {
                sb.append(str.charAt(i - 1)).append('\n');
            }
        }

        System.out.println(sb);
    }
}
