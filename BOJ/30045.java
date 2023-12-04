import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.contains("01") || str.contains("OI")) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
