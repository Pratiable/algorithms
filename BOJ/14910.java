import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int temp = Integer.parseInt(st.nextToken());

        while(st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());
            if (now < temp) {
                System.out.println("Bad");
                return;
            }
            temp = now;
        }
        System.out.println("Good");
    }
}