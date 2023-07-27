import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int f = p * 50 - c * 10;
        if (p > c) {
            f += 500;
        }
        System.out.println(f);
    }
}
