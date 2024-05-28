import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        int cnt = 1;
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != prev) {
                System.out.println(cnt);
                return;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
