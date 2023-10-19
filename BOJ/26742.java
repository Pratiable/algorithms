import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int b = 0;
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'B') {
                b++;
                continue;
            }
            c++;
        }

        System.out.println(b / 2 + c / 2);
    }
}