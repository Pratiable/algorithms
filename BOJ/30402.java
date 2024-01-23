import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 15; j++) {
                String c = st.nextToken();
                if (c.equals("w")) {
                    System.out.println("chunbae");
                    return;
                } else if (c.equals("b")) {
                    System.out.println("nabi");
                    return;
                } else if (c.equals("g")) {
                    System.out.println("yeongcheol");
                    return;
                }
            }
        }
    }
}
