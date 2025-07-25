import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String cString = st.nextToken();
        int c = cString.charAt(cString.length() - 1) - '0';

        System.out.println(c % 2 == 0 ? a : a ^ b);
    }
}
