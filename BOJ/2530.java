import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int taken = Integer.parseInt(br.readLine());

        int fs = (s + taken) % 60;
        int fm = ((m + ((s + taken) / 60)) % 60);
        int fh = ((h + ((m + ((s + taken) / 60)) / 60)) % 24);

        System.out.printf("%d %d %d%n", fh, fm, fs);
    }
}