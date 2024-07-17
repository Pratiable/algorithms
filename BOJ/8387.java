import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        String str2 = br.readLine();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == str2.charAt(i)) cnt++;
        }

        System.out.println(cnt);
    }
}