import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int s = 0;
        int b = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                s++;
                i += 7;
            } else {
                b++;
                i += 6;
            }
        }

        System.out.println(s == b ? "bigdata? security!" : s > b ? "security!" : "bigdata?");
    }
}
