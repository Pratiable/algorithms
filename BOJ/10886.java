import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = 0;
        int nc = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(br.readLine()) == 0) {
                nc++;
                continue;
            }
            c++;
        }

        System.out.println(c > nc ? "Junhee is cute!" : "Junhee is not cute!");
    }
}