import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<Character> avoids = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < str.length() - 1; i++) {
            char now = str.charAt(i);
            char next = str.charAt(i + 1);

            if (avoids.contains(now) == avoids.contains(next)) {
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");
    }
}
