import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int as = 0;
        int bs = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                as++;
            } else if (str.charAt(i) == 'B') {
                bs++;
            }
        }

        System.out.println(as + " : " + bs);
    }
}
