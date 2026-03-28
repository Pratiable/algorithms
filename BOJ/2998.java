import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        str = str.length() % 3 == 1 ? "00" + str : str.length() % 3 == 2 ? "0" + str : str;

        for (int i = 0; i < str.length(); i += 3) {
            sb.append((str.charAt(i) - '0') * 4 + (str.charAt(i + 1) - '0') * 2 + (str.charAt(i + 2) - '0'));
        }

        System.out.print(sb);
    }
}
