import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;
            
            if (a + b == 13) {
                sb.append("Never speak again.").append("\n");
            } else if (a > b) {
                sb.append("To the convention.").append("\n");
            } else if (a < b) {
                sb.append("Left beehind.").append("\n");
            } else {
                sb.append("Undecided.").append("\n");
            }
        }

        System.out.println(sb);
    }
}