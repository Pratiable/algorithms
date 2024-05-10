import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;

        for (char c : str.toCharArray()) {
            if (c == 'j') {
                cnt += 2;
            } else if (c == 'o') {
                cnt += 1;
            } else if (c == 'i') {
                cnt += 2;
            }
        }
        System.out.println(cnt);
    }
}