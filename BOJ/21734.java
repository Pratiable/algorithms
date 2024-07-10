import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int code = str.charAt(i);
            int repeat = 0;
            for (int j = 0; j < String.valueOf(code).length(); j++) {
                repeat += String.valueOf(code).charAt(j) - '0';
            }
            sb.append(String.valueOf(str.charAt(i)).repeat(repeat)).append("\n");
        }

        System.out.println(sb);
    }
}
