import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] hackerScores = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        boolean isHacker = false;
        int sum = 0;

        for (int i = 0; i < hackerScores.length; i++) {
            int score = Integer.parseInt(st.nextToken());
            if (score > hackerScores[i]) {
                isHacker = true;
                break;
            }
            sum += score;
        }

        System.out.println(isHacker ? "hacker" : sum >= 100 ? "draw" : "none");
    }
}