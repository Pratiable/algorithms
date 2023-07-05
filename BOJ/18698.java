import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'D') {
                    break;
                }
                cnt++;
            }
            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }
}
