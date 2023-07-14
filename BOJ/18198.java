import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i += 2) {
            int point = str.charAt(i + 1) - '0';
            if (str.charAt(i) == 'A') {
                a += point;
            } else {
                b += point;
            }

            boolean isWin = (a >= 11 && a - b >= 2) || (b >= 11 && b - a >= 2);
            
            if (isWin) {
                System.out.println(a > b ? "A" : "B");
                break;
            }
        }
    }
}