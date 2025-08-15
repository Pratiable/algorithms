import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ISBN = br.readLine();
        int weight = 0;
        int total = 0;

        for (int i = 0; i < 13; i++) {
            char now = ISBN.charAt(i);
            if (now == '*') {
                weight = i % 2 == 0 ? 1 : 3;
                continue;
            }

            total += (i % 2 == 0 ? 1 : 3) * (now - '0');
        }

        for (int i = 0; i < 10; i++) {
            if ((weight * i + total) % 10 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
