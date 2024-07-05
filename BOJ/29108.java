import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (!str.startsWith("io") || str.length() < 3) {
            System.out.println("Incorrect");
            return;
        }

        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) continue;
            System.out.println("Incorrect");
            return;
        }

        System.out.println("Correct");
    }
}