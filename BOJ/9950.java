import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("0 0 0")) break;
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0) {
                a = c / b;
            } else if (b == 0) {
                b = c / a;
            } else {
                c = a * b;
            }
            sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
        }
        
        System.out.println(sb);
    }
}