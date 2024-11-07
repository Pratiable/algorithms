import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        int a3 = Integer.parseInt(st.nextToken());
        int at = a1 + a2 * 2 + a3 * 3;

        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int b3 = Integer.parseInt(st.nextToken());
        int bt = b1 + b2 * 2 + b3 * 3;

        System.out.println(at > bt ? 1 :at < bt ? 2 : 0);

    }

}

