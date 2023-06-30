import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int result = Math.max(Math.max(h * v, h * (n - v)), Math.max((n - h) * v, (n - h) * (n - v))) * 4;

        System.out.println(result);
    }
}
