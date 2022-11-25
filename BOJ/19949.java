import java.io.*;
import java.util.*;

public class Main {
    static int cnt;
    static int[] answers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        cnt = 0;
        answers = new int[10];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            answers[i] = Integer.parseInt(st.nextToken());
        }
        solve(0, 0, 0, 0);
        System.out.println(cnt);
    }

    static void solve(int depth, int score, int before, int beforeTwo) {
        if (depth == 10) {
            if (score >= 5){
                cnt++;
            }
            return;
        }
        for (int j = 1; j <= 5; j++) {
            if (before == j && beforeTwo == j) continue;
            if (answers[depth] == j) {
                solve(depth + 1, score + 1, j, before);
            } else {
                solve(depth + 1, score, j, before);
            }
        }
    }
}