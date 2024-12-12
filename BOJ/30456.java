import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            sb.append('1').append("1".repeat(Math.max(0, l - 2))).append('0');
        } else if (n == 1) {
            sb.append("1".repeat(Math.max(0, l)));
        } else {
            sb.append((char)('0' + n)).append("1".repeat(Math.max(0, l - 1)));
        }

        System.out.println(sb);
    }
}
