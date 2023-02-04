import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') cnt++;
        }

        System.out.println(str.length() + 2 + (cnt * 5));
    }
}