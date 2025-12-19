import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name = br.readLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += name.charAt(i) - 'A';
        }

        System.out.print(sum + n);
    }
}
