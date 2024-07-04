import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char st = str.charAt(0);

        for (int i = 0; i < n; i++) {
            if (st != str.charAt(i)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}