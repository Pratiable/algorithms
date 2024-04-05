import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= n / 2 + 1; i++) {
            if (n % i == 0) sum += i;
        }

        sum += n;

        System.out.println(sum);
    }
}
