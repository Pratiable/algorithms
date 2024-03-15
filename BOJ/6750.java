import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'S' && str.charAt(i) != 'H' && str.charAt(i) != 'Z' && str.charAt(i) != 'X' && str.charAt(i) != 'N') {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}