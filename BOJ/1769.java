import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        getIsMultipleOfThree(str, 0);
    }

    public static void getIsMultipleOfThree(String str, int count) {
        if (str.length() == 1) {
            System.out.println(count);
            System.out.println(Integer.parseInt(str) % 3 == 0 ? "YES" : "NO");
            return;
        }
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            num += str.charAt(i) - '0';
        }

        getIsMultipleOfThree(String.valueOf(num), count + 1);
    }
}