import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String T = br.readLine();
        String prefix = "CHICKENS";
        int xor = T.charAt(0) ^ prefix.charAt(0);

        for (int i = 0; i < T.length(); i++) {
            sb.append((char)(T.charAt(i) ^ xor));
        }

        System.out.print(sb);
    }
}
