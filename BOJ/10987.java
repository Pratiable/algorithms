import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (now == 'a' || now == 'e' || now == 'i' || now == 'o' || now == 'u') res++;
        }

        System.out.println(res);
    }
}