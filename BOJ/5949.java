import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder(br.readLine()).reverse();
        sb.append(reverse.charAt(0));

        for (int i = 1; i < reverse.length(); i++) {
            if (i % 3 == 0) sb.append(',');
            sb.append(reverse.charAt(i));
        }

        System.out.println(sb.reverse());
    }
}
