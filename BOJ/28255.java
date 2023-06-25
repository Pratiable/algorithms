import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String iceCream = br.readLine().trim();
            int len = iceCream.length();
            int sLen = (int) Math.ceil(len / 3.0);
            String s = iceCream.substring(0, sLen);
            String rev = new StringBuilder(s).reverse().toString();
            String tail = s.substring(1);
            String tailRev = rev.substring(1);
            boolean a = iceCream.equals(s + rev + s);
            boolean b = iceCream.equals(s + tailRev + s);
            boolean c = iceCream.equals(s + rev + tail);
            boolean d = iceCream.equals(s + tailRev + tail);

            if (a || b || c || d) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
