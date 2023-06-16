import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 == 0) {
                sb.append(num).append(" is even\n");
            } else {
                sb.append(num).append(" is odd\n");
            }
        }
        
        System.out.print(sb);
    }
}
