import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (s <= 1023) {
            System.out.println("No thanks");
        } else {
            int left = s - 1023;
            if (left > m || (left & m) != left) {
                System.out.println("Impossible");
            } else {
                System.out.println("Thanks");
            }
        }
    }
}