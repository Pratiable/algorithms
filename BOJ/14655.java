import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int score = 0;

        for (int i = 0; i < N; i++) {
            score += Math.abs(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score += Math.abs(Integer.parseInt(st.nextToken()));
        }

        System.out.print(score);
    }
}
