import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int standard = 10;

        while (standard <= n) {
            n = ((n + standard / 2) / standard) * standard;
            standard *= 10;
        }

        System.out.println(n);
    }
}