import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int last = 0;
        boolean isPlus = b - a == c - b;

        if (n == 3) {
            last = c;
        } else {
            for (int i = 3; i < n; i++) {
                if (i == n - 1) {
                    last = Integer.parseInt(br.readLine());
                    break;
                }
                br.readLine();
            }
        }

        if (isPlus) {
            System.out.println(last + (b - a));
        } else {
            System.out.println(last * (b / a));
        }
    }
}