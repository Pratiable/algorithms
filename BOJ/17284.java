import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int change = 5000;

        while (st.hasMoreTokens()) {
            int cur = Integer.parseInt(st.nextToken());

            switch (cur) {
                case 1: change -= 500; break;
                case 2: change -= 800; break;
                case 3: change -= 1000; break;
            }
        }

        System.out.print(change);
    }
}
