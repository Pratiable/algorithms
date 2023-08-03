import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long m = Long.parseLong(br.readLine());
        long n = Long.parseLong(br.readLine());

        long result = (m == 1 || n == 1) ? Math.max(m, n) : 2 * (m + n) - 4;

        System.out.println(result);
    }
}
