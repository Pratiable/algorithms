import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int width = w - 2 * d;
        int height = h - 2 * d;

        System.out.println(width <= 0 || height <= 0 ? 0 : width * height);
    }
}
