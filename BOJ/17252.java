import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println("NO");
            return;
        }
        String nt = Integer.toString(n, 3);

        for (int i = 0; i < nt.length(); i++) {
            if (nt.charAt(i) == '2') {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}