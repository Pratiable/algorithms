import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int min = p;

        if (n >= 5) {
            min = Math.min(p - 500, min);
        }

        if (n >= 10) {
            min = (int) Math.min(p * 0.9, min);
        }

        if (n >= 15) {
            min = Math.min(p - 2000, min);
        }

        if (n >= 20) {
            min = (int) Math.min(p * 0.75, min);
        }

        System.out.println(Math.max(min, 0));
    }
}
