import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        if (n % 2 == 1) {
            System.out.println(0);
            return;
        } else if (n % 4 == 0) {
            System.out.println(2);
            return;
        }

        System.out.println(1);
    }
}