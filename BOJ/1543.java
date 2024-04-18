import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String std = br.readLine();
        int cnt = 0;

        for (int i = 0; i < str.length() - std.length() + 1; i++) {
            boolean isFit = true;
            for (int j = 0; j < std.length(); j++) {
                if (str.charAt(i + j) != std.charAt(j)) {
                    isFit = false;
                    break;
                }
            }
            if (isFit) {
                cnt++;
                i += std.length() - 1;
            }
        }

        System.out.println(cnt);
    }
}