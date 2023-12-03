import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sixteenth = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (sixteenth - now <= 1000) sum++;
        }

        System.out.println(sum);
    }
}
