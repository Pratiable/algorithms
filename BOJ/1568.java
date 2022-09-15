import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int now = 0;
        int sec = 0;
        while(true) {
            if (n == 0) break;
            sec++;
            now++;
            if (n - now < 0) now = 1;
            n -= now;
        }

        System.out.println(sec);
    }
}