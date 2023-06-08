import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a >= 10) {
            System.out.println(0);
            return;
        }
        
        int b = 1;
        for (int i = 1; i < a + 1; i++) {
            b = (b * i) % 10;
        }
        System.out.println(b);
    }
}
