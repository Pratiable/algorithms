import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int p = 0;
        int tmp = n;

        while (tmp % 2 == 0) {
            tmp /= 2;
            p++;
        }

        System.out.println(tmp + " " + p);
    }
}