import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            char now = n.charAt(i);
            int pow = (int) Math.pow(b, n.length() - i - 1);
            if (now <= '9' && now >= '0') {
                result += pow * (now - '0');
            } else {
                result += pow * ((now - 'A') + 10);
            }
        }
        System.out.println(result);
    }
}
