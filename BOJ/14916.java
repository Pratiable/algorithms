import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1 || n == 3) {
            System.out.println(-1);
            return;
        }

        if ((n % 5) % 2 == 0) {
            System.out.println(n / 5 + (n % 5) / 2);
        } else {
            System.out.println((n - 5) / 5 + (n % 5 + 5) / 2);
        }
    }
}