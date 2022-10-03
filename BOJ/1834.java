import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        Long result = 0L;
        for (long i = 0; i < n; i++) {
            result += (i * n) + i;
        }

        System.out.println(result);
    }
}