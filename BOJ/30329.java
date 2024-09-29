import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'k' && str.charAt(i + 1) == 'i' && str.charAt(i + 2) == 'c' && str.charAt(i + 3) == 'k') cnt++;
        }

        System.out.println(cnt);
    }
}
